import java.io.OutputStream;
import java.rmi.ServerError;

import Task_3.People;
import Task_3.Singleton;

/**
 * @ClassName test
 * @Description TODO
 * @Author nxl
 * #@Date 2023/11/20 17:15
 **/

public class test {
    //    public static void main(String[] args) {
//        //栈区         //堆区，将堆区地址放在p1中
//        People p1 = new People("张三", 20, "China");
//        p1.show();
//
//        People p2 = new People("asda", 20, "China");
//    }
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSin(); //调用对象
        Singleton s2 = Singleton.getSin();//调用对象，此时调用的都是同一个对象
        System.out.println(s1 == s2);
    }
}
