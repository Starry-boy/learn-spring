package com.ratel.learn.lifeCycleCallback;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author ratel
 * @date 2020/8/18
 */
@Component
public abstract class TestProtoType {

	@Lookup
	public abstract JavaBean javaBean();
}
