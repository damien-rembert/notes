# Java


# look into/homework
Comparator/comparable
Hashmap
Stream



variable.methodThatIsToBeUsedOnTheVariable(argument)

## creating a variable:
typeOfTheVar name = value;

## creating an instance of a class:
```java
NameOfTheClass nameOfTheInstance = new NameOfTheClass();
```

# todo
look into GUI JavaFX/Android/Swing (OmegaT uses Swing)

# Glossary

## Class
Classes are blueprints
Classes have instances (objects)
Objects contains state (fields/state/variables/data?) and behaviours (methods)

A class defines the attributes of objects, i.e., the information related to them (instance variables), and their commands, i.e., their methods. The values of instance (i.e., object) variables define the internal state of an individual object, whereas methods define the functionality it offers.


## Method (functions)

A Method is a piece of source code written inside a class that's been named and has the ability to be called. A method is always part of some class and is often used to modify the internal state of an object instantiated from a class.
As an example, ArrayList is a class offered by Java, and we've made use of objects instantiated from it in our programs.

### method that requires input: when called that method will need arguments as defined between the parenthesis
```java
public static void size(int number, int otherNumber) {
	System.out.println(number);
	System.out.println(otherNumber);
}
```


### method that returns a value: when called that method will need arguments as defined between the parenthesis
```java
System.out.println("getting the size of an array as a return value from the size method: " + size(numbers));

public static int size(ArrayList<Integer> list) {
    return list.size();
}
```

## XXXX (variables/data)
### Primitive data types
    int 5
    double 4.5
    char A
    boolean true/false
    string lfjslfjs
### Declaration:
datatype variableNameInCamelCase;
// declaration of int variable
int yearJavaWasCreated;
// assignment
yearJavaWasCreated = 1996;
// declaration and assignment
int numberOfPrimitiveTypes = 8;

## Comments // or /* */

.equals()

```java
String text = "first second third fourth";
String[] pieces = text.split(" ");
System.out.println(pieces[0]);
System.out.println(pieces[1]);
System.out.println(pieces[2]);
System.out.println(pieces[3]);

System.out.println();

for (int i = 0; i < pieces.length; i++) {
    System.out.println(pieces[i]);
}
```


## create a list/an instance of ArrayList
        ArrayList<String> listName = new ArrayList<>();
## create a list/an instance of ArrayList
         Scanner scanner = new Scanner(System.in);


accessing a field:
objectName.fieldName

// define the name of the class -which is the name of the file-:
public class Name {
	// define fields for the class with type and name
	String latinRoot;
	// int yearFirstUsed;
	
	// create a constructor method with parameters:
	public Name(String latinRoot) {
	// instance fields available in scope of constructor method
	}

// have a main method:
public  static void main(String[] args) { 
// end every statement with a semi-collon
// datatype variableName;
// create an instance using the constructor
Name John = new Name();
}
//close the class:
}
