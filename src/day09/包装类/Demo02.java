package day09.包装类;
/**
 * 基本数据类型与字符串类型之间的相互转换：
 * 基本类型 -> 字符串（String）
 *  1，基本类型的值 +"" 最简单的方法（工作中常用）
 *  2，包装类的静态方法toString（参数），不是Object类的toString（）重载
 *      static String toString(int i) 返回一个表示指定整数的Sting对象
 *  3，String类的静态方法valueOf（参数）
 *      static String valueOf(int i) 返回int参数的字符串表示形式
 * 字符串（String） -> 基本类型
 *  使用包装类的静态方法：parseXXX（"字符串"）;
 *      Integer类：static int parseInt(String s)
 *      Double类：static double parseDouble(String s)
 * */
public class Demo02 {
    public static void main(String[] args) {
        //基本类型 -> 字符串（String）
        int num = 10;
        String str = num + "";//基本类型转换字符串
        System.out.println("str = " + str + 20); //str已经是字符串了，所以这里的+号是字符串的拼接 //输出结果：1020



        //字符串 -> 基本类型
        int num1 = Integer.parseInt(str);
        System.out.println("num1 = " + num1);
    }
}
