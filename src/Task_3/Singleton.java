package Task_3;

/**
 * @ClassName Main
 * @Description TODO
 * @Author nxl
 * #@Date 2023/11/28 21:23
 **/
public class Singleton {

    private Singleton() {
    } //1、私有化构造方法，不能new对象

    //2、声明本类型 的引用指向本类的对象,但是外部能对其进行修改，需要封装
//    private static Singleton sin = new Singleton();//饿汉式
    private static Singleton sin = null;//懒汉式


    //3、提供get方法将对象返回,使用public和static共同修饰
    //饿汉式  推荐*
    public static Singleton getSin() {
        return sin;
    }
    //懒汉式
//    public static Singleton getSin() {
//        if (null == sin){
//            sin = new Singleton();
//        }
//        return sin;
//    }
}
