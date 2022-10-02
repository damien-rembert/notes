# Sorting


# sorted used to sort and print String (using the method compareTo from the String class)
```java
persons.stream().sorted((p1, p2) -> {
    return p1.getName().compareTo(p2.getName());
}).forEach(p -> System.out.println(p.getName()));
```

# sorted used to sort and print integers
```java
persons.stream().sorted((p1, p2) -> {
    return p1.getBirthYear() - p2.getBirthYear();
}).forEach(p -> System.out.println(p.getName()));
```

# sorting using the sort method in the Collections class with a lambda
```java
Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
```

