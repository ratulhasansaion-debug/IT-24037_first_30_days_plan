class Student {
    String name;
    int roll;
 Student() {
        name = "Default Name";
        roll = 0;
    }
 void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
