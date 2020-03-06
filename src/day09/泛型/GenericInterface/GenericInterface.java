package day09.泛型.GenericInterface;
/**
 * 接口中使用泛型
 * 格式：public interface MyInterface<E>{接口体}
 * 1，接口中含有泛型，实现类处确定泛型的类型，new对象时只能按照实现类的泛型数据类型来
 *  格式：Public class interface_Impl implements MyInterface<Integer>
 * 2，接口中含有泛型，实现类处接着定义泛型，new对象的时候再确定泛型的数据类型
 *  格式：Public class interface_Impl<E> implements MyInterface<E>
 *
 * 注意：
 * 抽象方法定义泛型格式：
 * public abstract void Method(E e){}
 *
 *
 * */
public interface GenericInterface <E> {
    public abstract void Method01(E e);
}
