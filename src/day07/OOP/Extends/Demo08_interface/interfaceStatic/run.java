package day07.OOP.Extends.Demo08_interface.interfaceStatic;

public class run {
    public static void main(String[] args) {
        //调用接口中的静态方法：

        //【错误写法】
        /*My_interfaceStaticImpl mifs = new My_interfaceStaticImpl();
        mifs.MethodStatic();*/

        //正确写法：直接通过接口名称.
        My_interfaceStatic.MethodStatic();      //这是一个静态方法


    }
}
