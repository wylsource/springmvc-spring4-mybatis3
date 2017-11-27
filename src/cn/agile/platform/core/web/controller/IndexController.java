package cn.agile.platform.core.web.controller;

import cn.agile.platform.core.entity.User;
import cn.agile.platform.core.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>Title: IndexController</p>
 * <p>Description: 首页控制器</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午5:50:59
 */
@Controller
public class IndexController {

	private static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/index.do")
	public String test(Integer id){
		System.out.println(id);
		return "index";
	}
	
	@RequestMapping("/addUser.do")
	public String addUser(Integer id){
		User user = new User(id, "张三", 18, "北京市");
		try {

			LOGGER.info("--start--: ,{}",user.getName());
			int addUser = userService.addUser(user);
			System.out.println(addUser);
			int i = 1/0;
		}catch (Exception e){
			e.printStackTrace();
			LOGGER.error(e.toString());
		}
		return "index";
	}
}
