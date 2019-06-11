package com.javaBaics.javaBaics.agent;

import com.javaBaics.javaBaics.agent.cglib.GlassProxy;
import com.javaBaics.javaBaics.agent.cglib.glassImpl;
import com.javaBaics.javaBaics.agent.jdk.BookFacade;
import com.javaBaics.javaBaics.agent.jdk.BookFacadeImpl;
import com.javaBaics.javaBaics.agent.jdk.BookFacadeProxy;
import com.javaBaics.javaBaics.agent.statics.CountImpl;
import com.javaBaics.javaBaics.agent.statics.CountProxy;

public class TestProxy {
    public static void main(String[] args) {
        //静态代理
        CountImpl count = new CountImpl();
        CountProxy proxy = new CountProxy(count);
        proxy.queryCount();
        proxy.updateCount();
        //jdk代理
        BookFacadeImpl bookFacade = new BookFacadeImpl();
        BookFacadeProxy bookFacadeProxy = new BookFacadeProxy();
        BookFacade facade = (BookFacade)bookFacadeProxy.bindBusinessProxy(bookFacade);
        facade.addBook();
        //cglib代理
        glassImpl glass = new glassImpl();
        GlassProxy glassProxy = new GlassProxy();
        glassImpl impl = (glassImpl)glassProxy.getInstance(glass);
        impl.addGlass();
    }
}
