package cn.zongbin.com.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		// 像<user:aa 这样以user开头的元素，就会把这个元素扔给UserBeanDefinitionParser去解析
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
