package com.javaBaics.javaBaics.operator;

/***
 * java中有三种移位运算符
 *
 * << :左移运算符，num << 1,相当于num乘以2
 *
 * >> :右移运算符，num >> 1,相当于num除以2
 *
 * >>> :无符号右移，忽略符号位，空位都以0补齐
 */
public class ShiftOperators {

    public static void main(String[] args) {
        leftOrright();
        System.out.println(2|2);
    }

    public static void leftOrright(){
         int num = 10;
        System.out.println("原："+print(num));
       /* num = num << 2;
        System.out.println("乘以2："+print(num));*/
        num = 5 << 2;
        System.out.println(num);
        System.out.println("除以2："+print(num));


        /***
         * 0011 0101
         * 11 = 3
         * 101 = 5
         */
    }

    /**
     * 输出一个int的二进制数
     * @param num
     * @return
     */
    public static String print(int num){
        return Integer.toBinaryString(num);
    }

}
