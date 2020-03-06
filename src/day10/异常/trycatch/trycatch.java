package day10.异常.trycatch;
/**
 * 异常处理的第二种方式：自己处理异常
 * try..catch只是用来预防异常的发生，把有可能发生异常的代码写在try中，如果try中没有发生异常，那么catch中的代码不会执行
 * 格式：
 *      try{
 *          //可能产生异常的代码
 *      }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
 *          //异常的处理逻辑：产生异常对象之后怎么处理异常对象
 *          //一般在工作中，会把异常的信息记录到一个日志中
 *      }
 *      ....
 *      catch(异常名，变量名){
 *          //处理逻辑
 *      }
 * 注意：
 *      1，try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
 *      2，如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的代码，继续执行try..catch之后的代码
 *          如果try中没有产生异常，那么就不会执行catch中代码，继续try..catch后的代码执行
 *
 *  * Throw类中定义了3个异常处理的方法：
 *  *      String getMessage()：返回此throwable的简短描述
 *  *      String toString()：返回throwable的详细消息字符串
 *  *      void printStackTrace()JVM默认此方法，打印异常对象，默认此方法，打印的异常信息是最全面的
 *
 * */
public class trycatch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        /*int num = arr[11];  //数组索引越界异常
        System.out.println("后续代码1");    //上面发生异常后程序将会中断，这里不会被执行*/

        try {
            int num = arr[1];
            System.out.println(num);
            System.out.println("异常下面的代码");  //如果发生异常，这句代码将会无法被执行
        }catch (ArrayIndexOutOfBoundsException e){// try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            System.out.println("数组索引越界异常，请修改代码");

            /**String getMessage()：返回此throwable的简短描述*/
            System.out.println(e.getMessage());//Index 11 out of bounds for length 10
            /**String toString()：返回throwable的详细消息字符串*/
            System.out.println(e.toString());   //java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
            /**void printStackTrace()JVM默认此方法，打印异常对象，默认此方法，打印的异常信息是最全面的*/
//            e.printStackTrace();      //直接打印红色异常代码

        }
        System.out.println("后续代码2");

    }
}
