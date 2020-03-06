package day10.异常.多异常捕获处理方法;

import java.util.ArrayList;
import java.util.List;

/**
 * 多个异常捕获的三种方式：
 *  1，多个异常分别处理（多个try catch）
 *  2，多个异常一次捕获，多次处理(一个try 多个catch)
 *      注意：catch里面定义的异常变量如果有父子关系，那么子类的异常变量必须卸载上边，否则会报错
 *      ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
 *  3，多个异常一次捕获，一次处理（一个try 一个catch）
 *
 *
 * */
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();

//        System.out.println(arr[5]);//java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(list.get(5));//java.lang.ArrayIndexOutOfBoundsException


        /***  1，多个异常分别处理（多个try catch）*/
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("发生异常1");
        }

        try {
            System.out.println(list.get(5));
        }catch (IndexOutOfBoundsException e){
            System.out.println("发生异常1");
        }


        /**2，多个异常一次捕获，多次处理(一个try 多个catch)
         * 一个try 多个catch注意：
         * catch里面定义的异常变量如果有父子关系，那么子类的异常变量必须卸载上边，否则会报错
         *     ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         * */

        try {
            System.out.println(arr[5]); //第一个异常：ArrayIndexOutOfBoundsException
            System.out.println(list.get(0));//第二个异常：IndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            //两个异常用一个处理方法
            System.out.println("发生异常2.1");
        }catch (IndexOutOfBoundsException e){
            System.out.println("发生异常2.2");
        }

        /**3，多个异常一次捕获，一次处理（一个try 一个catch）*/
        try {
            System.out.println(arr[5]);
            System.out.println(list.get(5));;
        }catch (Exception e){//不管发生什么异常，直接写所有异常的父类
            System.out.println("发生异常3");
        }

        System.out.println("后续代码！！！！！！！！！！！！！！！！！！！");
    }
}
