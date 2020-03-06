package day10.异常.throw_test;

import java.util.Objects;

/**
 * Object类中的静态方法
 * public static <T> T requireNonNull(T obj):查看指定引用对象是不是null
 * 源码：
 *  public static <T> T requireNonNull(T obj){
 *      if (obj==null){
 *           throw new NullPointerException();
 *           return obj;
 *
 *  }
 *
 * */

public class 参数非空判断 {
    public static void main(String[] args) {
        Method(null);
    }
    private static void Method(Object obj) {
        Objects.requireNonNull(obj);        //判断传过来的参数是否为空，为空则返回一个空指针异常对象：java.lang.NullPointerException
        System.out.println(obj);
    }
}
