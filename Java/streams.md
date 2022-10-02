# Streams

Stream functions can use static methods as parameters:
*stream*.filter(value -> Screeners.greaterThanFive(value)).*furtherAction*
// is the same as
*stream*.filter(Screeners::greaterThanFive).*furtherAction*
The syntax Screeners::greaterThanFive is saying: "use the static method called greaterThanFive that's in the Screeners class".


# Example:
```java
long numbersDivisibleByThree = inputs.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(number -> number % 3 == 0)
    .count();
```

## Explanation:
.mapToInt(s -> Integer.valueOf(s))
    (mapToInt(value -> conversion)) converts the number into an Integer
.filter(number -> number % 3 == 0)
    (filter (value -> filter condition)) filters the numbers
.count();
    counts and return the value for the variable of type long numbersDivisibleByThree.

# Intermediate Operations
Intermediate stream operations are methods that return a stream. They can be called sequentially.
# map and mapToInt methods
converting a value from one form to another using map and its more specific form mapToInt used for converting a stream to an integer stream. eg a stream of person objects could be turned into a stream of strings:
.map(person -> person.getFirstName())
# filter method
filtering values
# distinct method
identifying unique values
# sorted method
arranging values

# Terminal operations
## count method
for counting the number of values on a list,
## forEach method
for going a through list values, you cannot modify the list when using this method eg remove an element
## collect method
for gathering the list values ​​into a data structure:
eg .collect(Collectors.toCollection(ArrayList::new));
## reduce method
for combining the list items.
eg reduce(*initialState*, (*previous*, *object*) -> *actions on the object*)
int sum = values.stream()
    .reduce(0, (previousSum, value) -> previousSum + value);
OR with an ArrayList of strings:
String combined = words.stream()
    .reduce("", (previousString, word) -> previousString + word + "\n");
System.out.println(combined);


# Lambda expression
// original
*stream*.filter(value -> value > 5).*furtherAction*
// is the same as
*stream*.filter((Integer value) -> {
    if (value > 5) {
        return true;
    }
    return false;
}).*furtherAction*


## sorted used to sort and print String (using the method compareTo from the String class)
```java
persons.stream().sorted((p1, p2) -> {
    return p1.getName().compareTo(p2.getName());
}).forEach(p -> System.out.println(p.getName()));
```

## sorted used to sort and print integers
```java
persons.stream().sorted((p1, p2) -> {
    return p1.getBirthYear() - p2.getBirthYear();
}).forEach(p -> System.out.println(p.getName()));
```





# Outside variables
Functions that handle stream elements ​​cannot change values ​​of variables outside of the function.



Stream formation: `stream()`
    The method is called on collection that implements the Collection interface, such as an ArrayList Object. Something is done on the created stream.
Converting a stream into an integer stream: `mapToInt(value -> another)`
    The stream transforms into one containing integers. A stream containing strings can be converted using, for instance, the valueOf method of the Integer class. Something is done with the stream containing integers.
Filtering values: `filter(value -> filter condition)`
    The elements that do not satisfy the filter condition are removed from the string. On the right side of the arrow is a statement that returns a boolean. If the boolean is `true`, the element is accepted into the stream. If the boolean evaluates to false, the value is not accepted into the stream. Something is done with the filtered values.
    Calculating the average: `average()`
Returns a OptionalDouble-type object that has a method `getAsDouble()` that returns a value of type `double`. Calling the method `average()` works on streams that contain integers - they can be created with the `mapToInt` method.
Counting the number of elements in a stream: `count()`
    Returns the number of elements in a stream as a `long`-type value.


