package day07.OOP.polymorphism.Demo01;
/*
* 面对对象三大特征：多态
* 多态的条件：继承（extends），接口（interface）
* 代码中体现多态性，其实就是一句话：父类引用指向子类对象
* 格式：
* 父类名称 对象名 = new 子类名称（）； 或者说： 动物 狗狗 = new 狗（）；
* 或者：
* 接口名称 对象名 = new 实现类名称（）；
*
*
*
* */
public class Multi {
    public static void main(String[] args) {
        //普通写法
        /*Fu fu = new Fu();
        Zi zi = new Zi();*/

        //使用多态写法
        Fu obj = new Zi();      //父类引用指向子类对象
        obj.Method();           //子类方法      new了谁就调用谁的方法
        //但是如果子类中没有的方法则会想上找（向左边找）
        obj.MethodFu();         //父类特有方法    //方法在等号右边（对象类）的类找





    }
}
