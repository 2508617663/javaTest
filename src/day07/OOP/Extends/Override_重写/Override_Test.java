package day07.OOP.Extends.Override_重写;
/*
* 重写（Override_Test）：在继承关系中，方法名称一样，参数列表也一样将会构成方法重写
*
* 复习一样方法重载（Overload）：方法名一样，参数列表不一样
*
* 重写的注意事项：
*   1必须保证父子类之间方法的名称相同，参数列表相同
*
*   2.子类方法的返回值必须【小于等于】父类方法的返回值（本来是一个小河，覆盖重写成一个大海，将会装不下）
*
*   3.子类方法的修饰符权限（public > protected > default > private）必须【大于等于】父类方法的权限修饰符
*       default是默认（什么都不写）
* 注解：@Override      //用来判断有没有被覆盖重写覆盖重写  ，如果没有构成覆盖重写注解将会报错
* */
public class Override_Test {
    public void Method(){
        System.out.println("Hello");
    }
}
