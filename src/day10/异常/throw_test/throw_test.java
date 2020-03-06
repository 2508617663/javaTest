package day10.异常.throw_test;


import java.util.Objects;

/**
 * throw关键字：
 * 作用：
 *      可以使用throw关键字在指定的方法中抛出指定的异常
 * 使用格式:throw 异常名称
 *
 * 注意：
 *      1，throw关键字必须写在方法内部
 *      2，throw关键字后边new的对象必须是Exception或者exception的子类对象
 *      3，throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *          throw关键字后边创建的对象是RuntimeException或者是RuntimeException的子类对象，我们可以不处理，默认交给JVM处理（打印异常对象，中断程序）
 *          throw关键字后边创建的是编译异常（写代码的时候报的错），我们就必须处理这个异常，要么throws，要么try catch
 *
 *
 *
 * */
public class throw_test {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int[] arr2 = null;
        method01(arr2,0);   //传入一个空数组

    }

    private static int method01(int[] arr,int index) {
        /**我们可以对传递过来的参数数组进行 合法性判断
         * 如果数组arr的值是null
         * 那么我们就抛出空指针异常，告知方法调用者“传递的数组为null”
         * */
        if (arr==null){
            throw new NullPointerException("传递的数组为null");
        }
        if (index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }
        int num = arr[index];
        System.out.println(num);
        return num;
    }
}
