package cn.agile.platform.helper.exception;

/**
 * <p>Title: BusinessException</p>
 * <p>Description: 业务逻辑异常封装类</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午10:43:59
 */
public class BusinessException extends RuntimeException{
	
	private Integer code;

    public Integer getCode() {
        return code;
    }

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

//    public BusinessException(Integer code) {
//        super(LoadExceptionMessageUtil.loadErrorMsg(code));
//        this.code = code;
//    }

}
