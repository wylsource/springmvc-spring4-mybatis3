package cn.agile.platform.helper.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.agile.platform.helper.exception.BusinessException;
import cn.agile.platform.helper.utils.JsonUtil;
import cn.agile.platform.helper.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Title: HandlerAllException</p>
 * <p>Description: 全局异常处理器</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午10:46:08
 */
public class HandlerAllException implements HandlerExceptionResolver{

	 private final static Logger LOGGER = LoggerFactory.getLogger(HandlerAllException.class);

	 public void handle(Exception e, HttpServletResponse response){
        if(e instanceof BusinessException){
            BusinessException businessException = (BusinessException)e;
	            ResponseUtil.senderJson(response, JsonUtil.toJson("异常"));
        }else{
            LOGGER.error("[系统异常]={}",e.getMessage());
//	            ResponseUtil.senderJson(response, JsonUtil.toJson(ResultUtil.filed(-1,"系统错误")));
            ResponseUtil.senderJson(response, JsonUtil.toJson("异常"));
        }
	 }
	 public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		 
		 /** 可以跳转到专门的错误页面。也可以返回错误信息  */
		 handle(e, httpServletResponse);
		 return null;
	 }
}
