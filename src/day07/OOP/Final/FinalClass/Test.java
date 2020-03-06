package day07.OOP.Final.FinalClass;
/*
* final关键字代表最终的，不可变的
*
* 常见四种用法：
*   1，可以用来修饰一个类
*   2，可以用来修饰一个方法
*   3，可以用来修饰一个局部变量
*   3，可以用来修饰一个成员变量
*
* */
public abstract class Test /*extends MyFinalClass*/{     //无法继承被final修饰的类

    public void MethodTest(){
        System.out.println("我是Test中的方法");
    }

    public abstract void TestAbs();

}
