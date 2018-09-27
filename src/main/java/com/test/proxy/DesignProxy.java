package com.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2018/9/27.
 */
public class DesignProxy implements InvocationHandler{
    private Object target;
    public Object newProxyInstance(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("认证之前记录日志");
       Object result =  method.invoke(target,args);
        System.out.println("认证结束记录日志");
        return result;
    }
}
