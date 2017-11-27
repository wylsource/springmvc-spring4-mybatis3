package cn.agile.platform.core.service.impl;

import cn.agile.platform.core.dao.IUserMapper;
import cn.agile.platform.core.entity.User;
import cn.agile.platform.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: WuYL
 * @Description: 业务层接口
 * @Date: Create in 2017/11/22 15:30
 * @Modified By:
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserMapper uesrMapper;
	
	/**
	 * 添加用户
	 */
	@Override
	public int addUser(User user) {
//		int i = 1/0;
		return uesrMapper.insert(user);
	}

}
