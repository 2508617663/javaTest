package day10.异常.finally_test;
/**
 * finally关键字：有一些特定的代码无论异常是否发生都需要执行的话，就可以使用finally关键字修饰
 *      因为异常会发生跳转，一旦异常发生就直接跳到catch中，异常下面的所有代码将不会被执行，finally就是为了解决这个问题
 * 格式：
 *       try{
 *            //可能产生异常的代码
 *       }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
 *            //异常的处理逻辑：产生异常对象之后怎么处理异常对象
 *            //一般在工作中，会把异常的信息记录到一个日志中
 *        }
 *        ....
 *        catch(异常名，变量名){
 *            //处理逻辑
 *        }finally{
 *            //一定要执行的代码
 *        }
 * 注意：
 *      1，finally类不能单独使用，必须和try一起使用
 *      2，finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要释放资源
 *
 * */
public class finally_test {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        try {
            int num = arr[11];
            System.out.println(num);
            //假设发生异常下面的hello将不会被执行，但是如果有些代码一定要被执行就可以在catch下面使用finally
//            System.out.println("Hello");

        }catch (IndexOutOfBoundsException e ){
            System.out.println("数组索引越界异常");
        }finally {//假设发生异常下面的hello将不会被执行，但是如果有些代码一定要被执行就可以在catch下面使用finally
            //无论异常是否发生，finally里面的代码都会被执行
            System.out.println("资源释放");
        }

        System.out.println("后续代码");
    }
}
