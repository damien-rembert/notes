Methods

# Naming conventions
Verbs, in mixed case, first letter lowercase and the first letter of each internal word capitalized.

# notions
a class defines an object's methods 
the values of instance (object) variables are object-specific.

object.methodThatIsToBeUsedOnTheObject(argument);

# Definition

A METHOD/FUNCTION is a piece of source code written inside a class that's been named and has the ability to be called. A method is always part of some class and is often used to modify the internal state of an object instantiated from a class.
As an example, ArrayList is a class offered by Java, and we've made use of objects instantiated from it in our programs.



# method overloading
An overloaded method is just a different method that happens to have the same name.

```Java
public void growOlder() {
    this.age = this.age + 1;
}

public void growOlder(int years) {
    this.age = this.age + years;
}
```


# constructor methods

An object is always instantiated by calling a *method that creates an object*, i.e., a constructor by using the "new" keyword.
Account artosAccount = new Account("Arto's account", 100.00);
// in the class:

```Java
    public Account (String nameOwner, initialAmount) {
        this.owner = nameOwner;
        this.amount = initialAmount;
    }
```


## Overloading a constructor

```Java
    public Account (String nameOwner, initialAmount) {
        this.owner = nameOwner;
        this.amount = initialAmount;
    }
    
    public Account (String nameOwner) {
        this(nameOwner, 0)
    }
```

    

# creating methods and calling methods

```Java
import java.util.Scanner;

public class ProgramStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // program code
        System.out.println("Let's try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let's try again:");
        greet();
        greet();
        greet();
    }

    // own methods
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
}
```


## passing arguments
method that requires input: when called that method will need arguments as defined between the parenthesis

```Java


public class Example {
    public static void main(String[] args) {
        sum(3, 5);
       
        int number1 = 2;
        int number2 = 4;
       
        sum(number1, number2);       
    }
   
    public static void sum(int first, int second) {
        System.out.println("" + first + " + " + second + " = " + (first+ second));
    }
}
    public static void size(int number, int otherNumber) {
	System.out.println(number);
	System.out.println(otherNumber);
    }
```

## returning a value
method that returns a value: that method will need a return statement to return the type of value indicated in front of the method name

```Java
    public static int size(ArrayList<Integer> list) {
        return list.size();
    }

// void in methods that return nothing indicate this. Here int indicate the method will return an integer
public static int multiplyByTen(int parameter) {

    parameter = parameter * 10;
    return parameter;
}
```

## Set and Get methods
```Java
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }
```

# Abstract

# Static or not

## Methods without the static modifier are instance methods. 
Instance methods are methods that are associated with an object, can process the objects variables and can call the object's other methods. Instance methods specifically CAN use the *this* modifier, which refers to the variables associated with the specific object, that is calling the instance method. 

## Methods with the static modifier are class methods
Class methods can't use the *this* modifier, meaning that they can only access the variables they are given as parameters or that they create themselves.
In reality class methods can also access class variable, among other things.
