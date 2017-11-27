package cn.agile.platform.helper.vo;

/**
 * <p>Title: Result</p>
 * <p>Description: 统一返回结果</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午10:38:41
 */
public class Result<T> {

	 /** 错误码 0>正常 1>异常 */
    private Integer code;

    /** 错误的提示信息 */
    private String msg;

    /** 正常返回的信息 */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
