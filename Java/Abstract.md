# Abstract

# Abstract classes
Used to define a template for a group of subclasses
Making the class abstract guarantees it cannot be instantiated (but its subclasses can be)
Abstract classes can have abstract and non abstract methods
If even just one abstract method, the class must be marked as abstract
```java
abstract class Shape {...};
abstract class Figure {...};
public class Square extends Shape  {...};
```


# Abstract methods
Can only be used in an abstract class: if even just one abstract method, the class must be marked as abstract
Does not have a body. The body is provided by the subclass.

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}```

