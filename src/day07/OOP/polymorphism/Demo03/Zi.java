package day07.OOP.polymorphism.Demo03;

public class Zi extends Fu {
    @Override
    public void Method(){
        System.out.println("覆盖重写后的子类方法");
    }

    public void MethodZi(){
        System.out.println("子类特有方法");
    }
}
