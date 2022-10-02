# Constructor methods
An object is always instantiated by calling a *method that creates an object*, i.e., a constructor by using the "new" keyword.
I put a new Account object into the variable named artosAccount

```java
Account artosAccount = new Account("Arto's account", 100.00);
// in the class:
    public Account (String nameOwner, initialAmount) {
        this.owner = nameOwner;
        this.amount = initialAmount;
    }
```


# Constructor overload

```java
// more than just one constructor
public Person(String name) {
    this(name, 0);
    //here the code of the second constructor is run, and the age is set to 0
}

public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 0;
    this.height = 0;
}

// new objects being created:
public static void main(String[] args) {
    Person paul = new Person("Paul", 24);
    Person eve = new Person("Eve");

    System.out.println(paul);
    System.out.println(eve);
}
```

