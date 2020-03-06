package day07.OOP.Extends.Demo08_interface;
/*
* 在任何版本的Java中，接口都能定义抽象方法：
* 抽象方法定义格式:public abstract 返回值类型 方法名称（参数列表）；
*
* 注意事项：
*   1，接口当中的抽象方法，修饰符只能是两个固定的：public abstract     //(不写这两个修饰符，它的作用也还存在)
*   2，public abstract 可以选择性忽略不写，但是，哪怕没有写，它的作用也还在（写不写都一样，都有）
*
* 接口使用步骤：
*   1，接口不能直接是使用，必须有一个“实现类”来实现该接口
* 实现类格式：
* public class 实现类名称 implements{
*   //实现类体
* }
*   2,实现类同样也要覆盖重写接口中的所有抽象方法
*
*
* */
public interface My_interface {
    //1，接口当中的抽象方法，修饰符只能是两个固定的：public abstract
    public abstract void MethodAbs1();
//    private abstract void methodabs1();    //错误写法

    //2，public abstract 可以选择性忽略不写，但是，哪怕没有写，它的作用也还在（写不写都一样，都有）
//    public abstract void MethodAbs(); //这两个效果一样
//    void MethodAbs();     //这两个效果一样

    public abstract void MethodAbs2();
    public abstract void MethodAbs3();
    public abstract void MethodAbs4();
    public abstract void MethodAbs5();

}
