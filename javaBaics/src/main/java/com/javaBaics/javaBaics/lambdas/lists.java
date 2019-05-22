package com.javaBaics.javaBaics.lambdas;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lists {


    public static void testLambad(String str,TestLambad<String> testLambad){
        testLambad.sayMessage(str);
        testLambad.defMessage();
    }

    public static void listX(){
        lists.testLambad("2222",s -> System.out.println(s));
    }


    public static void testThread(){
        new Thread(() ->{
            System.out.println("噢噢噢噢噢噢噢噢噢");
        }).start();
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

    /***
     * 集合实现方法
     */
    public static void testList(){
        //直接存字符串遍历方法
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        //只打印包含J的数据
        languages.stream().filter(s -> s.contains("J")).forEach(str ->{
            System.out.println(str);
        });
        //Map处理方法
        Map<String,Object> mp = new HashMap<String,Object>();
        mp.put("1111",111);
        mp.put("2222",2222);
        mp.forEach((k,v) ->{
            System.out.println(k+":====:"+v);
        });


    }


}
