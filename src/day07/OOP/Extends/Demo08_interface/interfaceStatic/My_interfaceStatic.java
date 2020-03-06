package day07.OOP.Extends.Demo08_interface.interfaceStatic;
/*
* 从Java8开始，接口中允许定义静态方法
* 格式：
* public static 返回值类型 方法名称（参数列表）{
*       //方法体
* }
* 就是将abstract或者default换成static即可
*
* 接口中的静态方法调用不需要实现类,直接通过接口名称.即可
*
*
* */
public interface My_interfaceStatic {

    public static void MethodStatic(){
        System.out.println("这是一个静态方法");
    }
}
