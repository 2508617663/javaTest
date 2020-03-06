package day07.OOP.Extends.Demo08_interface.interfaceDefault;
/*
* 从Java8开始，接口里允许定义默认方法
* 格式：
* public default 返回值类型 方法名称（参数列表）{
*       //方法体
* }
* 备注，接口当中的默认方法，可以解决接口升级的问题，（众所周知，接口的实现类必须覆盖重写接口中所有的抽象方法，假如实现类很多，接口这
* 时新增一个抽象类，下面所有实现类都要跟着改，默认方法就是为了解决这个问题）
*
* 默认方法会被实现类继承下去，所以只需要在new实现类对象的时候，对象名. 即可
* 同时默认方法也可以在实现类中进行覆盖重写
*
*
* */
public interface My_interfaceDefault {
    //抽象方法
    public abstract void Method01();

    //【错误示范】新添加的抽象方法
//    public abstract void Method02();  //加入这里新添加了一个抽象方法，下面所有实现类都要重新操作

    //正确操作：
    public default void MethodDefault(){
        System.out.println("我是默认方法");
    }
}
