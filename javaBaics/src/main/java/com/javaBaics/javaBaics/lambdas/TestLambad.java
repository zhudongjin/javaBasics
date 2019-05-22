package com.javaBaics.javaBaics.lambdas;

@FunctionalInterface
interface TestLambad<T> {

   public void sayMessage(T message);

   public default void defMessage(){
        System.out.println("default");
    }
}
