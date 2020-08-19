package com.ratel.learn.customProxy;

import java.lang.reflect.Method;

/**
 * @author ratel
 * @date 2020/8/19
 */
public interface InvocationHandler {

	Object invocation(Object proxy,Method method,Object... args) throws Exception;
}
