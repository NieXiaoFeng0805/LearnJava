package Task_3;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author nxl
 * #@Date 2023/11/29 20:12
 **/
public class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        setName(name);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
