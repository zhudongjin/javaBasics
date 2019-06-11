package com.javaBaics.javaBaics.agent.statics;

public class CountProxy implements Count {

    private CountImpl count;

    public CountProxy(CountImpl count){
        this.count = count;
    }

    @Override
    public void queryCount() {
        System.out.println("static proxy query-----begin");
        count.queryCount();
        System.out.println("static proxy query-----end");
    }

    @Override
    public void updateCount() {
        System.out.println("static proxy update-----begin");
        count.updateCount();
        System.out.println("static proxy update-----end");
    }
}
