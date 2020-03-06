package day09.泛型.GenericInterface;
/**
 * 1，接口中含有泛型，实现类处确定泛型的类型，new对象时只能按照实现类的泛型数据类型来
 *
 * */
public class GenericInterface_Impl1 implements GenericInterface<Integer> {//在实现类处确定泛型的数据类型为String，new这个对象就只能传入String
    @Override
    public void Method01(Integer i) {

    }
}
