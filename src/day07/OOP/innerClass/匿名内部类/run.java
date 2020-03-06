package day07.OOP.innerClass.匿名内部类;
/*
* 如果接口的实现类（或是父类的子类）只需要使用唯一的一次
* 那么这种情况下就可以省略掉该类 的定义，而改为使用【匿名内部类】
* 格式:
* 接口名称 对象名 = new 接口名称（）{
*   //覆盖重写接口中所有的抽象方法
* }
* 大括号里面就是一个没有名字的匿名内部类
*
* 对格式‘new 接口名称(){......}’进行解析：
* 1，new代表创建对象的动作
* 2，接口名称就是匿名内部类需要实现哪个接口
* 3，{.....}这才是匿名内部类的内容
*
* 注意：
* 1，匿名内部类，在创建对象的时候，只能使用唯一一次
* 如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了
* 2，匿名对象在【调用方法】的时候只能调用唯一一次，如果希望同一个对象调用多次方法，那么必须给对象起个名字
* 3，匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】，强调！：匿名内部类和匿名对象不是一回事
*
* */
public class run {
    public static void main(String[] args) {
        //匿名对象
        /*new MyInterfaceImpl().Method();*/
        //多态，父类引用指向之类对象
        //MyInterface obj = new MyInterfaceImpl();


        //匿名内部类
        MyInterface mi = new MyInterface() {
            @Override
            public void Method01() {
                System.out.println("使用匿名内部类覆盖重写接口中的抽象方法");
            }

            @Override
            public void Method02() {
                System.out.println("222");
            }
        };
        mi.Method01();
        mi.Method02();




        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface(){

            @Override
            public void Method01() {
                System.out.println("我是匿名内部类中匿名对象01");
            }

            @Override
            public void Method02() {
                System.out.println("我是匿名内部类中匿名对象02");
            }
        }.Method02();   //使用匿名对象方式调用匿名内部类中的方法   只能调用一次


    }
}
