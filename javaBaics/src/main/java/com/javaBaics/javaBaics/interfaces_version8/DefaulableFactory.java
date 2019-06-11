package com.javaBaics.javaBaics.interfaces_version8;

import java.util.function.Supplier;

public interface DefaulableFactory {

    static DefaultInterface create(Supplier<DefaultInterface> supplier){
        return supplier.get();
    }
}
