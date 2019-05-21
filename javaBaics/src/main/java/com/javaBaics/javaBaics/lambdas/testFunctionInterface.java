package com.javaBaics.javaBaics.lambdas;

@FunctionalInterface
interface testFunctionInterface {

    void sayMessage(String message);

    default void defMessage(){
        System.out.println("default");
    }
}
