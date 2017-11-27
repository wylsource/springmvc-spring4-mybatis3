package cn.agile.platform.core.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import cn.agile.platform.core.entity.User;
import cn.agile.platform.core.service.IUserService;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * <p>Title: ConfigurationListener</p>
 * <p>Description: 项目启动加载全局参数的 Listener</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月24日 下午9:07:40
 */
public class ConfigurationListener implements ServletContextListener{

	
	/**
	 * 上下文销毁方法
	 */
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		//TODO 
	}

	/**
	 * 上下文初始化方法
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("-----initial-----");
		/**
		 * WebApplicationContextUtils.getWebApplicationContext(event.getServletContext()).getBean(IElaSearchService.class);
		 *  */
		IUserService userService = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext()).getBean(IUserService.class);
		User user = new User();
		user.setName("test init");
		userService.addUser(user);
		//TODO 加载系统需要的初始化数据
		
	}

}
