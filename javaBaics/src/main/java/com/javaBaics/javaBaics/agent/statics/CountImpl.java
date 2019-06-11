package com.javaBaics.javaBaics.agent.statics;

public class CountImpl implements Count {
    @Override
    public void queryCount() {
        System.out.println("查询咯！");
    }

    @Override
    public void updateCount() {
        System.out.println("更新咯！");
    }
}
