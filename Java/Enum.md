# Enum

##  Definition
If we know the possible values ​​of a variable in advance, we can use a class of type enum, i.e., enumerated type to represent the values. Enumerated types are their own type in addition to being normal classes and interfaces.

```java
public enum Suit {
    DIAMOND, SPADE, CLUB, HEART
}

public class Card {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
}
```


## Enumerated types may contain object reference variables for which they need a private constructor
```java
public enum Color {
    // constructor parameters are defined as
    // the constants are enumerated
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code;        // object reference variable

    private Color(String code) { // constructor
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
```

## To access value
```java
nameOfEnum.NAME_OF_CONSTANT
System.out.println(Color.GREEN.getCode());
```

## to get the "rank"/"place" of a value in the declaration
public final int ordinal()
Returns the ordinal of this enumeration constant (its position in its enum declaration, where the initial constant is assigned an ordinal of zero). Most programmers will have no use for this method. It is designed for use by sophisticated enum-based data structures, such as EnumSet and EnumMap.


