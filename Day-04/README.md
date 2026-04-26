# Example-01
```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  
        d.bark(); 
    }
}
```
---
# Example-02
```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();

        Bike myBike = new Bike();
        myBike.start();
        myBike.ride();
    }
}
```
