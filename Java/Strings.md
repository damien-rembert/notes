# Strings


# String operations
	String string;
	string.toLowerCase();
	string.trim(); // (remove whitespace at the beginning and at the end of the string)


.equals()
.splits()
.length()
.matches()

```java
String word = "equisterian";
int length = word.length();

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


System.out.print("Provide a student number: ");
String number = scanner.nextLine();

if (number.matches("01[0-9]{7}")) {
    System.out.println("Correct format.");
} else {
    System.out.println("Incorrect format.");
}
```
