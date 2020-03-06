package day09.泛型.GenericMethod;

public class GenericMethod_Run {
    public static void main(String[] args) {
        /**调用GenericMethod中带泛型的普通方法*/
        GenericMethod gm = new GenericMethod();
        gm.Method01(3.14);
        gm.Method01("张三");
        gm.Method01(10);
        gm.Method01(true);


        /**调用GenericMethod中带泛型的静态方法*/
        GenericMethod.Method02(3.14);
        GenericMethod.Method02(10);
        GenericMethod.Method02("asdasdasdas");
    }
}
