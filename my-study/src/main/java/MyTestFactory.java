import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyTestFactory {
	public static void main(String args[]) {
		// 创建spring容器
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("my-test-bean.xml"));
		MyTestBean myTestBean = bf.getBean("myTest",MyTestBean.class);
		System.out.println(myTestBean.getHello());
	}
}
