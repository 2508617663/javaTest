package day07.OOP.polymorphism.Demo03;
/*
* 在多态中，成员方法的访问规则是：
*   看new的是谁，就优先用谁，没有则向上找
*
* 口诀，编译看左边，运行看右边
*
* 对比一下：
* 成员变量：编译看左边，运行看左边。
* 成员方法：编译看左边，运行看右边。
*
* */
public class MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.Method();   //覆盖重写后的子类方法

        //但是调用的是子类特有方法的话将会编译不通过
//        obj.MethodZi();


    }
}
