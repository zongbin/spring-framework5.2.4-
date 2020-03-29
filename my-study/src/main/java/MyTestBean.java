import java.util.List;

public class MyTestBean {
	private String hello;
	private List<String> lists;

	public MyTestBean() {
	}

	/*
	 * 构造器注入
	 */
	public MyTestBean(String hello1, List<String> lists1) {
		this.hello = hello1;
		this.lists = lists1;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}


	public void setLists(List lists) {
		this.lists = lists;
	}

	public List<String> getLists() {
		return lists;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"hello='" + hello + '\'' +
				", lists=" + lists +
				'}';
	}
}
