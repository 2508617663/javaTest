package day07.OOP.Extends.Demo08_interface;
/*
* 接口是多个类的公共规范
* 接口时一种引用数据类型，最重要的内容就是其中的：抽象方法
* 定义接口格式：
*   public interface 接口名称{
*       //接口内容
* }
* 如果是Java7，那么接口中可以包含的内容有：
*   1，常量
*   2，抽象方法
* 如果是Java8，还可以额外包含有：
*   3，默认方法
*   4，静态方法
* 如果是Java9，还可以额外包含有：
*   5，私有方法
*
* 注意：
* 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
*
* */
public class Test {
    public static void main(String[] args) {
        //错误写法，不能直接new接口使用
        /*My_interface mi = new My_interface() {
        }*/

        //正确写法：new接口的实现类
        My_interface_Impl impl = new My_interface_Impl();
        impl.MethodAbs1();
        impl.MethodAbs2();
        impl.MethodAbs3();
        impl.MethodAbs4();
        impl.MethodAbs5();
    }
}
