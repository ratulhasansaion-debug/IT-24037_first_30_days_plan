class Student {
    private String name;
    private int age;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        }
    }
    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Saion");
        s.setAge(22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
