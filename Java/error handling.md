# error handling


# Exception class
`.printStackTrace()` prints the stack trace, which shows how we ended up with an exception
A stack trace is read chronologically from the bottom up (at the bottom is the first call).

# Basic Error Handling

```java
public int readNumber(Scanner reader) {
    while (true) {
        System.out.print("Give a number: ");

        try {
            // code that could throw an exception
            int readNumber = Integer.parseInt(reader.nextLine());
            return readNumber;
        } catch (Exception e) {
            // Code that's executed if an error is thrown
            System.out.println("User input was not a number.");
        }
    }
}
```
# Resource error handling
called try-with-resources exception handling, for OS resources.
this closes the used resources automatically.

```java
ArrayList<String> lines =  new ArrayList<>();

// create a Scanner object for reading files
try (Scanner reader = new Scanner(new File("file.txt"))) {

    // read all lines from a file
    while (reader.hasNextLine()) {
        lines.add(reader.nextLine());
    }
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

// do something with the lines
```

# Exceptions that need to be handled
Checked for during compilation. Due to this, some exceptions have to be prepared for with a try-catch block or by throwing them out of a method with a throws attribute in a method declaration. For example, exceptions related to handling files, including IOException and FileNotFoundException, are this kind of exception.


Can be handled by wrapping them in a try/catch block OR throwing them out of the method this is indicated when declaring the method by adding `throws *ExceptionType*`:

```java
public List<String> readLines(String fileName) throws Exception {
    ArrayList<String> lines =  new ArrayList<>();
    Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
    return lines;
}
```


# Exceptions that do not NEED TO be handled
Not checked for during compilation but can be thrown during execution. These kinds of exceptions do not have to be handled with a try-catch block. For example, IllegalArgumentException and NullPointerException are this kind of exception.

If the exception is a runtime exception, such as `IllegalArgumentException`, it is not necessary to indicate it when declaring the method

```java
public class Grade {
    private int grade;

    public Grade(int grade) {
        if (grade < 0 || grade > 5) {
            throw new IllegalArgumentException("Grade must be between 0 and 5.");
        }

        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}
```

