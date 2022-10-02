# Inheritance and polymorphism

# Extending a class
```java
public abstract class Animal {...}
public interface NoiseCapable {...}
public class Dog extends Animal implements NoiseCapable {...}
```

# Requirements for/when overriding methods
Access level needs to be the same or more permissive
Arguments and return values need to be the same

If a variable from the super class needs to be accessed by subclasses, make it "protected" rather than "private"

# Referring to super class elements
```java
super.method
super.var
super()
```

# Creating an instance of a subclass
```java
Employee pierre = new Accountant();
```

