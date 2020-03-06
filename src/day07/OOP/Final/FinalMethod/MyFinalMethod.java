package day07.OOP.Final.FinalMethod;
/*
* 2，当final用来修饰一个方法的时候：类可以有子类，但是被final修饰的那个方法不能被覆盖重写
* 格式：
* 修饰符 final 返回值类型 方法名（参数列表）{ //方法体}
*
* 注意：
* 对于类，方法来说，abstract 和 final关键字不能同时使用，因为abstract抽象类（抽象方法）需要被覆盖重写，而被final修饰则不能被覆盖重写
*
*
* */
public abstract class MyFinalMethod {
    //普通方法：
    public void Method(){
        System.out.println("我是一个普通方法");
    }

    //但是如果一个方法被final修饰的话将不能被覆盖重写
    public final void MethodFinal(){
        System.out.println("我是Final方法");
    }

    //对于类，方法来说，abstract 和 final关键字不能同时使用，因为abstract抽象类（抽象方法）需要被覆盖重写，而被final修饰则不能被覆盖重写
//    public abstract final void methodFinal(){}


}
