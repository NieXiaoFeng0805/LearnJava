package Task_3;

/**
 * @ClassName People
 * @Description TODO
 * @Author nxl
 * #@Date 2023/11/28 21:23
 **/
public class People {
    // 私有化成员
    private String name;
    private int age;
    private String country;

    //设置构造函数
    public People() {
    }

    //封装类
    public People(String name, int age, String country) {
        setName(name);
        setAge(age);
        setCountry(country);
    }

    //设置get、set方法而不是设置为public属性是为了对该类中的成员进行保护，提供一个简介访问的操作
    //set方法的设置
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("无效年龄！");
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //get方法的设置
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void show() {
        System.out.println("我是" + getName() + "，今年" + getAge() + "来自" + getCountry());
    }

}
