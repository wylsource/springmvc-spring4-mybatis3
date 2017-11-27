package cn.agile.platform.core.dao;

import cn.agile.platform.core.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: WuYL
 * @Description: 数据层接口
 * @Date: Create in 2017/11/25 15:28
 * @Modified By:
 */
@Repository
public interface IUserMapper {

    int insert(User record);

    int insertSelective(User record);
}
