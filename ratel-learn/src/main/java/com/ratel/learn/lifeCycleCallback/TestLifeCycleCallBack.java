package com.ratel.learn.lifeCycleCallback;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * @author ratel
 * @date 2020/8/17
 */

@Component
public class TestLifeCycleCallBack implements InitializingBean, BeanPostProcessor, ApplicationContextAware, DisposableBean {


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean 初始化成功后回调 InitializingBean.afterPropertiesSet");
	}

	@PostConstruct
	public void init(){
		System.out.println("Bean 初始化成功后回调 @PostConstruct");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Bean 初始化成功后回调 ApplicationContextAware.setApplicationContext");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean 初始化成功前回调 BeanPostProcessor.postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean 初始化成功后回调 BeanPostProcessor.postProcessAfterInitialization");
		return bean;
	}
	@PreDestroy
	public void preDestroy(){
		System.out.println("容器销毁前回调 @PreDestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("容器销毁时回调 DisposableBean.destroy");
	}
}

