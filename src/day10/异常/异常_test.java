package day10.异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.Throwable
 * 异常体系：
 * java.lang.Throwable是java语言中所有错误或异常的超类
 *  已知子类：
 * Exception：编译器异常，，进行编译（写代码）Java程序出现的问题
 *     RuntimeException：运行期异常，Java程序运行时出现的问题
 *     异常就相当于程序得了一个小感冒，把异常处理掉可以继续执行
 * Error：错误，就相当于程序得了一个无法治愈的毛病，必须修改源代码程序才能继续执行
 *
 *
 * java中异常处理的五个关键字：trycatch,catch,finally,throw,throws
 *
 *
 *
 *
 * */
public class 异常_test {
    public static void main(String[] args) {
        /**Exception：编译器异常，，进行编译（写代码）Java程序出现的问题*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse("1998-05-02");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
        System.out.println("后续代码");

        /**RuntimeException：运行期异常，Java程序运行时出现的问题*/
        int[] arr = {10,20,30};
//        System.out.println(arr[1]);
//        System.out.println(arr[5]);       //索引越界异常：java.lang.ArrayIndexOutOfBoundsException
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("后续代码执行1");



        /**Error：错误，就相当于程序得了一个无法治愈的毛病，必须修改源代码程序才能继续执行*/
        int[] arr1 = new int[1024]; //定义一个数组长度为1024长度的int数组     没问题
        int[] arr2 = new int[1024*1024*1024];   //定义一个数组长度为1024*1024*1024长度的数组，出现内存溢出的错误：java.lang.OutOfMemoryError
        //如果发生了Error错误则不管是抛出还是try catch都没有用，必须要回来修改代码

        System.out.println("后续代码执行2");


    }
}
