# Parameterized Constructor
```java
class Student {
    String name;
    int roll;
    Student(String n, int r) {
        name = n;
        roll = r;
    }
    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Abir", 101);
        Student s2 = new Student("Siam", 102);

        s1.display();
        s2.display();
    }
}
___
# No arg Constructor

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

