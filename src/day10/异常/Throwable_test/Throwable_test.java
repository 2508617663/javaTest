package day10.异常.Throwable_test;
/**
 * java.lang.Throwable是所有错误或者异常的父类
 * Throwable已知子类：
 * Exception：编译器异常，，进行编译（写代码）Java程序出现的问题
 *     RuntimeException：运行期异常，Java程序运行时出现的问题
 *     异常就相当于程序得了一个小感冒，把异常处理掉可以继续执行
 * Error：错误，就相当于程序得了一个无法治愈的毛病，必须修改源代码程序才能继续执行
 *
 * java中异常处理的五个关键字：trycatch,catch,finally,throw,throws
 *
 *
 * Throw类中定义了3个异常处理的方法：
 *      String getMessage()：返回此throwable的简短描述
 *      String toString()：返回throwable的详细消息字符串
 *      void printStackTrace()JVM默认此方法，打印异常对象，默认此方法，打印的异常信息是最全面的
 *
 * */
public class Throwable_test {
}
