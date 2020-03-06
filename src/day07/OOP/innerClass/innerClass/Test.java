package day07.OOP.innerClass.innerClass;

/*
 * 内部类
 *
 * 分类：
 *   1，成员内部类
 *   2，局部内部类（包含匿名内部类）
 * 成员内部类的定义格式：
 * 修饰符 class 外部类名称 {
 *   修饰符 class 内部类格式{
 *       //..........
 *   }
 * }
 * 注意：
 * 内用外，随意访问
 * 外用内，需要内部类对象
 *
 * 两种使用成员内部类的方式：
 *  1，间接方式：再外部类的方法当中使用内部类，然后main只是调用外部类的方法
 *  2，直接方式：公式：
 * 类名称 对象名 = new 类名称();
 * 【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 *
 *
 * */
public class Test { //外部类
    //成员变量
    private int num1 = 10;


    //成员内部类
    public class InnerClass {    //成员内部类
        public int innerNum = 20;

        public void InnerMethod() {  //成员内部类中的方法
            //内部类访问外部类成员变量：随意访问
            System.out.println(num1);
            //内部类访问外部类方法：随意访问
            Method2();
        }
    }


    //外部类成员方法
    public void Method() {   //外部类成员方法
        //外部类访问内部类成员变量：需要new对象
        InnerClass ic = new InnerClass();
        System.out.println(ic.innerNum);
        //外部类访问内部类方法：需要new对象
        ic.InnerMethod();
    }

    //外部类成员方法二
    public void Method2() {
        System.out.println("外部类成员方法");
    }
}
