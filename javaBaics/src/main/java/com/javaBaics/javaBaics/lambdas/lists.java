package com.javaBaics.javaBaics.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lists {

    public static void listX(){
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.stream().forEach(str ->{
            System.out.println(str);
        });
        Collectors.toList();
    }


    public static void testThread(){
        new Thread(() ->{
            System.out.println("噢噢噢噢噢噢噢噢噢");
        }).start();
    }

    public static void testFunctionInterface(){
        testFunctionInterface testFunctionInterface = message -> System.out.println("11");
        testFunctionInterface testFunctionInterface1 = message -> {};
    }

    public static void filtertest(){
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        //filter(languages,(str)->str.);
        filter(languages, (String)->"".startsWith("J"));
    }

    public static void filter(List names, Predicate condition){
       names.stream().filter((name)->(condition.test(name)))
               .forEach((name)->{
                   System.out.println(name);
               });
    }


}
