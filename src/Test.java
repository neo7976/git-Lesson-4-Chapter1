public class Test {


    public String name;
    private int age;


    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Тестовое имя: " + name + "( " + age + " лет)";
    }
}
