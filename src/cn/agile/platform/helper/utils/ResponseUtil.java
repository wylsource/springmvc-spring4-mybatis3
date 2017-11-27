package cn.agile.platform.helper.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>Title: ResponseUtil</p>
 * <p>Description: 异步返回各种格式 json xml text</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午10:40:34
 */
public class ResponseUtil {

    private static Logger LOGGER = LoggerFactory.getLogger(ResponseUtil.class);

    //发送内容"contentType;charset=UTF-8"
    public static void sender(HttpServletResponse response,String text,String contentType){
        response.setContentType(contentType);
        try {
            response.getWriter().write(text);
        } catch (IOException e) {
            LOGGER.error("response text failure", e);
            throw new RuntimeException(e);
        }
    }
    //发送json格式
    public static void senderJson(HttpServletResponse response, String text){
        sender(response, text, "application/json;charset=UTF-8");
    }
    //发送xml格式
    public static void senderXml(HttpServletResponse response,String text){
        sender(response, text, "text/xml;charset=UTF-8");
    }
    //发送text格式
    public static void senderText(HttpServletResponse response,String text){
        sender(response, text, "text/plain;charset=UTF-8");
    }
}
