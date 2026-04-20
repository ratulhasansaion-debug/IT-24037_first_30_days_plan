Example 1: Student class
***
```java
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
```
***
Example 2: BankAccount class
```java
class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println(acc.getBalance());
    }
}
```
