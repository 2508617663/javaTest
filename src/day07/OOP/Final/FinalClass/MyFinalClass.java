package day07.OOP.Final.FinalClass;
/*
* 当final用来修饰一个类的时候
* 格式
* public final class MyFinalClass{ //类体  }
*
* 被final修饰的类不能有任何的子类（太监类）
*
* 注意：一个类如果被final修饰，那么其所有的成员方法都无法进行覆盖重写（因为没有子类）
*       但是一个被final修饰的类可以对其父类中的方法进行覆盖重写
*
* */
public final class MyFinalClass extends Test {      //但是可以覆盖重写父类中的方法
    @Override
    public void MethodTest(){
        System.out.println("覆盖重写啦");
    }

    @Override
    public void TestAbs() {

    }

}
