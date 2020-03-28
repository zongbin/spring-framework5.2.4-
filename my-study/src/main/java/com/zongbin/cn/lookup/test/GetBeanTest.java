package com.zongbin.cn.lookup.test;

import com.zongbin.cn.lookup.bean.User;

public abstract class GetBeanTest {
	public void showMe(){
		this.getBean().showMe();
	}
	public abstract User getBean();
}
