package cn.agile.platform.helper.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

/**
 * <p>Title: JsonUtil</p>
 * <p>Description: Json 工具类</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午10:58:20
 */
public class JsonUtil {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

	 private static final Gson GSON = new Gson();

	    /**
	     * 将 JSON 转换为 POJO
	     * @param jsonStr
	     * @param clazz
	     * @param <T>
	     * @return
	     */
	    public static <T> T fromJson(String jsonStr, Class<T> clazz) {
	        T obj;
	        try {
	            obj = GSON.fromJson(jsonStr, clazz);
	        } catch (Exception e) {
	        	LOGGER.error("convert JSON to POJO failure", e);
	            throw new RuntimeException(e);
	        }
	        return obj;
	    }


	    /**
	     * 将 POJO 转换为 JSON
	     * @param object
	     * @param <T>
	     * @return
	     */
	    public static <T> String toJson(T object) {
	        String json;
	        try {
	            json = GSON.toJson(object);
	        } catch (Exception e) {
	        	LOGGER.error("convert POJO to JSON failure", e);
	            throw new RuntimeException(e);
	        }
	        return json;
	    }

}
