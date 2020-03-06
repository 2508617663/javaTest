package day07.OOP.Extends.Demo08_interface.interfaceDefault;

public class DemoB implements My_interfaceDefault {
    @Override
    public void Method01() {
        System.out.println("实现了覆盖重写BBBBBBBBBB");
    }
    //同时默认方法也可以在实现类中进行覆盖重写
    @Override
    public void MethodDefault(){
        System.out.println("覆盖重写了接口中的默认方法");
    }
}
