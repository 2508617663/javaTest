package day07.OOP.innerClass.局部内部类;
/*
* 局部内部类概念：在一个方法内部定义的一个类，那么这个类就是局部内部类
* “局部”是值该局部内部类只在该方法中使用，出了这个方法外面就不能用了
* 格式：
* 外部类{
* 外部类成员变量{
*   class 内部类名称
*   }
* }
* 注意：
* 局部内部类没有修饰符，因为局部内部类只有本类自己才可以使用，所以修饰符在这里没有意义
*
*
* */
public class Test { //外部类

    public void Method(){   //外部成员方法

        class innerClass{   //在方法内的“局部内部类”

                int num = 10;
                public void InnerMethod(){  //局部内部类的成员方法
            }
        }

        innerClass ic = new innerClass();
        System.out.println(ic.num); //局部内部类只能在本类中使用，出了本类外都无法访问
    }

}
