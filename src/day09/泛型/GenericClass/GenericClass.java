package day09.泛型.GenericClass;
/**
 *
 * 定义一个含有泛型的类，模拟ArrayList集合
 * 泛型是一个未知的数据类型，当我们不确定什么用什么数据类型的时候就可以使用泛型
 * 泛型可以接收任意的数据类型，可以使用Integer，String，Student.....
 * 在创建对象的时候选择泛型的数据类型
 * 格式： public class MyClass<E>{类体}
 *
 * */
public class GenericClass<E> {
    private E name;

    public GenericClass() {
    }

    public GenericClass(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
