package Task_3;

/**
 * @ClassName Task_3.Dog
 * @Description TODO
 * @Author nxl
 * #@Date 2023/11/29 20:38
 **/
public class Dog extends Animal {
    private int tooth;

    public Dog() {
        super();
    }

    public Dog(String name, String color, int tooth) {
        super(name, color);  //继承父类的有参构造函数
        setTooth(tooth);
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        if (tooth >= 0) {
            this.tooth = tooth;
        } else {
            System.out.println("输入错误");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("牙齿数量为：" + getTooth());
    }
}
