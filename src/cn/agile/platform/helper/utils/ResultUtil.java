package cn.agile.platform.helper.utils;


import cn.agile.platform.helper.vo.Result;

/**
 * <p>Title: ResultUtil</p>
 * <p>Description: 返回结果处理的工具类</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午10:41:27
 */
public class ResultUtil {

    private static Result result = null;

    /**
     * 正常情况下处理返回结果(返回的结果不为NUll)
     */
    public static Result success(Object object){
        result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 正常情况下处理返回结果（返回的结果为null）
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 异常情况下处理返回结果
     */
//    public static Result filed(Integer code){
//       return filed(code,LoadExceptionMessageUtil.loadErrorMsg(code));
//    }

    /**
     * 异常情况下处理返回结果
     */
//    public static Result filed(Integer code, String msg){
//        result = new Result();
//        result.setCode(code);
//        result.setMsg(LoadExceptionMessageUtil.loadErrorMsg(code));
//        return result;
//    }
}

