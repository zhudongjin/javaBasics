package com.javaBaics.javaBaics.agent.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class GlassProxy implements MethodInterceptor {
    private Object obj ;

    public Object getInstance(Object obj){
        this.obj = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("添加杯子之前");
        result =  methodProxy.invokeSuper(o,objects);
        System.out.println("添加杯子之后");
        return result;
    }
}
