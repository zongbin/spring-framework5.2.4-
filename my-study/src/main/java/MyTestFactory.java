import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestFactory {
	public static void main(String args[]) {
		// 创建spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("my-test-bean.xml");
		MyTestBean myTestBean = context.getBean("myTest",MyTestBean.class);
		System.out.println(myTestBean.getHello());
	}
}
