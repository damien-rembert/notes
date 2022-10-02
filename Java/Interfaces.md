# Interfaces

# Definition
A class can have more than one interface.
The class and super classes define who you are and the interface defines the roles you can play.
A class that implement an interface must implement all the methods of the interface since they are implicitly public and abstract.
Cannot be instantiated


```java
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```




# Implementing an interface
```java
public abstract class Animal {...};
public interface NoiseCapable {...};
public class Dog extends Animal implements NoiseCapable {...};
public class Dog extends Animal implements NoiseCapable, Comparable, Pet {...};
```




# difference between the *Map*, *List*, *Collection* and *Set* interfaces?

lists and sets are categorized as collections in Java — both the *List* and *Set* interfaces implement the *Collection* interface.

The *Collection* interface provides, for instance, methods for checking the existence of an item (the method *contains*) and determining the size of a collection (the method *size*).

Any class that implements the *Collection* interface, either directly or indirectly, inherits the functionality required for a for-each loop.


# Map
## methods provided


# Set
implements the *Collection* interface
## methods provided
.contains(X): checking the existence of an item (from the Collection interface)
.size(): determining the size of a collection (from the Collection interface)
functionality required for a for-each loop.

# List
implements the *Collection* interface
## methods provided
.contains(X): checking the existence of an item (from the Collection interface)
.size(): determining the size of a collection (from the Collection interface)
functionality required for a for-each loop.


# Collection
## methods provided
.contains(X): checking the existence of an item
.size(): determining the size of a collection
functionality required for a for-each loop.








