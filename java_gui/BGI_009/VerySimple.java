package java_gui.BGI_009;

// BGI-VerySimple/VerySimple.java

public class VerySimple {
    private int    age;
    private String name;

    // constructor
    public VerySimple(int age, String n) {
        this.age = age;
        name = n;
    }
    //getters
    public int getAge()  {
        return age;
    }
    void setAge(int a) {
        age = a;
    }
    // getter (with no corresponding setter)
    public String getName() {
        return name;
    }
}

