package com.javaBaics.javaBaics.agent.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {

    //业务对象
    private Object obj;

    /***
     * 绑定业务对象返回代理类
     * @param obj
     * @return
     */
    public Object bindBusinessProxy(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null ;
        System.out.println("动态代理------begin------");
        result = method.invoke(obj,args);
        System.out.println("动态代理------end------");
        return result;
    }
}
