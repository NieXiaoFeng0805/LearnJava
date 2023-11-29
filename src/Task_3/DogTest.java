package Task_3;

/**
 * @ClassName DogTest
 * @Description TODO
 * @Author nxl
 * #@Date 2023/11/29 20:46
 **/
public class DogTest {
    public static void main(String[] args) {
        //无参构造
        Dog d1 = new Dog();
        d1.show();
        //有参构造
        Dog d2 = new Dog("asdad", "white", 10);
        d2.show();
    }
}
