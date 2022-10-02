# Comparator class
# // or is it an interface?

The Comparator class provides two essential methods for sorting:
comparing and thenComparing.

The comparing method is passed the value to be compared first,

thenComparing method is the next value to be compared. The thenComparing method can be used many times by chaining methods, which allows virtually unlimited values ​​to be used for comparison.

When we sort objects, the comparing and thenComparing methods are given a reference to the object's type - the method is called in order and the values ​​returned by the method are compared. The method reference is given as Class::method. In the example below, we print movies by year and title in order.

```java
import java.util.Comparator;



List<Film> films = new ArrayList<>();
films.add(new Film("A", 2000));
films.add(new Film("B", 1999));
films.add(new Film("C", 2001));
films.add(new Film("D", 2000));

// The method reference is given as Class::method.
Comparator<Film> comparator = Comparator
              .comparing(Film::getReleaseYear)
              .thenComparing(Film::getName);

Collections.sort(films, comparator);
```
