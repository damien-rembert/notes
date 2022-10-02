# Troubleshooting

see JUnit, Unit Testing, Test-Driven dev

# Checklist
Indent your code properly and find out if there are any missing parentheses.
Verify that the variables used are correctly named.
Test the program flow with different inputs and find out the sort of input that causes the program to not work as desired. If you received an error in the tests, the tests may also indicate the input used.
Add print commands to the program in which you print out the values of the variables used at various stages of the program's execution.
Verify that all variables you are using are initialized. If they aren't, a NullPointerException error will occur.
If your program causes an exception, you should definitely pay attention to the stack trace associated with the exception, which is the list of method calls that resulted in the situation that caused the exception.
Learn how to use the debugger. The earlier video will get you started.

# Stacktrace
at Program.main(Program.java:15)
	This means the problem is in the file Program.java, at line 15

# Passing Test Input to Scanner
Passing a string to the constructor of the Scanner class replaces input read from the keyboard. As such, the content of the string variable input 'simulates' user input.
String input = "one\n" + "two\n"  +
                "three\n" + "four\n" +
                "five\n" + "one\n"  +
                "six\n";

Scanner reader = new Scanner(input);

ArrayList<String> read = new ArrayList<>();

while (true) {
    System.out.println("Enter an input: ");
    String line = reader.nextLine();
    if (read.contains(line)) {
        break;
    }

    read.add(line);
}

System.out.println("Thank you!");

if (read.contains("six")) {
    System.out.println("A value that should not have been added to the group was added to it.");
}

# Using junit

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }
}
