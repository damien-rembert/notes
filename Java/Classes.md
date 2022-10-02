# Classes

# Naming conventions
Nouns, in mixed case, first letter of each word capitalized
class Raster;
class ImageSprite;

# creating an instance of a class:
```java
NameOfTheClass nameOfTheInstance = new NameOfTheClass();
// OR
NameOfTheSuperClass nameOfTheInstance = new NameOfTheSubClass();
```

# Definition
Classes are blueprints
Classes have instances (objects)
Objects contains state (fields/state/variables/data?) and behaviours (methods)

A class defines the attributes of objects, i.e., the information related to them (instance variables), and their commands, i.e., their methods. The values of instance (i.e., object) variables define the internal state of an individual object, whereas methods define the functionality it offers.

# static keyword
static classes are classes that are "not about objects"

# Object class
Methods include:
```java
boolean equals(Object o) {...};
Class getClass() {...};
int hashCode() {...};
String toString() {...};
```

# Inheritance
To extend a class (making it the super class of the newly created sub class):
public class Dog extends Animal

## subclasses
More specific version of a class
When you need to override or add new behaviours


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


# Interface
SEE /mnt/data/Nextcloud/Notes/Technical/java/Interfaces.md
A class can have more than one interface.
public class Dog implements Pet;
interface Pet {...} 
The class and super classes define who you are and the interface defines the roles you can play.
A class that implement an interface must implement all the methods of the interface since they are implicitly public and abstract.


