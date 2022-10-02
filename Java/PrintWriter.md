# PrintWriter

# not to be confused with FileWriter

# write to file

```java
public class Storer {

    public void writeToFile(String fileName, String text) throws Exception {
        // PrintWriter writer = new PrintWriter("file.txt");
        PrintWriter writer = new PrintWriter(fileName);
        writer.println(text);
        writer.print("And a little extra"); // writes the string "And a little extra" to the file without a line change
        writer.close(); //closes the file and ensures that the written text is saved to the file
    }
}
```


# reading a file
```java

```


# Passing Test Input to Scanner
Passing a string to the constructor of the Scanner class replaces input read from the keyboard. As such, the content of the string variable input 'simulates' user input.
```java

```

