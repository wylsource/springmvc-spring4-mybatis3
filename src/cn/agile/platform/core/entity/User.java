package cn.agile.platform.core.entity;

/**
 * <p>Title: User</p>
 * <p>Description: 用户实体（测试用）</p>
 * <p>Company: 北京爱知之星</p> 
 * @author WuYL 
 * @date 2017年11月22日 下午5:58:42
 */
public class User {
	
	 	private Integer id;

	    private String name;
	
	    private Integer age;
	
	    private String addr;
	
	    public User(Integer id, String name, Integer age, String addr) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.addr = addr;
	    }
	
	    public User() {
	        super();
	    }
	
	    public Integer getId() {
	        return id;
	    }
	
	    public void setId(Integer id) {
	        this.id = id;
	    }
	
	    public String getName() {
	        return name;
	    }
	
	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }
	
	    public Integer getAge() {
	        return age;
	    }
	
	    public void setAge(Integer age) {
	        this.age = age;
	    }
	
	    public String getAddr() {
	        return addr;
	    }
	
	    public void setAddr(String addr) {
	        this.addr = addr == null ? null : addr.trim();
	    }

}
