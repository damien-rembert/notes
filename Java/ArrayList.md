# ArrayList

.contains
.remove
.add
.size
.get

```java
// import the arraylist class so the program can use it
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // create a list
        // ArrayList<String> listWords = new ArrayList<>();
        ArrayList<Double> listNumbers = new ArrayList<>();
        listNumbers.add(4.2);
        System.out.println(listNumbers.get(0));
    }
}

list.size()
list.remove(1); // 1 being the index of the value to remove
list.remove(Integer.valueOf(15)); // 15 being the value > would it remove all occurences or just the first one?
list.contains("Second")


ArrayList<String> list = new ArrayList<>();

list.add("First");
list.add("Second");
list.add("Third");

System.out.println("Is the first found? " + list.contains("First"));

// remove the string "hello world!"
list.remove("hello world!");
 // remove the value at index 3
list.remove(3);

boolean found = list.contains("Second");
if (found) {
    System.out.println("Second was found");
}

// or more simply
if (list.contains("Second")) {
    System.out.println("Second can still be found");
}
```


# add an object (an instance of Person class) to an array called persons

```java
// create array of Person objects called persons
ArrayList<Person> persons = new ArrayList<>();
// add a Person instance to persons array
persons.add(new Person(name, age));
```


# go through / enumerate elements

// several different repeat statements can be
// used to go through the list elements

## 1. while loop
```java
int index = 0;
while (index < names.size()) {
    System.out.println(names.get(index));
    index = index + 1;
}
```


## 2. for loop with index
```java
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}
```


## 3.a for each loop (no index)
```java
for (String name: names) {
    System.out.println(name);
```
    
    
## 3.b for each loop with objects

```java
// Assume we have a 'persons' list
// that consists of person objects

System.out.print("What is the age limit? ");
int ageLimit = Integer.valueOf(scanner.nextLine());

for (Person person: persons) {
    if (person.getAge() >= ageLimit) {
        System.out.println(person);
    }
}
```
