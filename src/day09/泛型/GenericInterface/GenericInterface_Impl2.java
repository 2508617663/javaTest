package day09.泛型.GenericInterface;
/**
 * 2，接口中含有泛型，实现类处接着定义泛型，new对象的时候再确定泛型的数据类型
 *
 * */
public class GenericInterface_Impl2<E> implements GenericInterface <E> { //这里接着定义泛型，new这个对象的时候再确定该泛型的类型
    @Override
    public void Method01(E e) {

    }
}
