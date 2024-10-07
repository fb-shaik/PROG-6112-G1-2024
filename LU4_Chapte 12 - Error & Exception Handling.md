Error Handling:

Definition: Errors are issues that occur at a low level in the application. They often indicate critical conditions that are beyond the control of the application.

Characteristics:
Errors typically occur due to resource limitations or failures in the runtime environment, such as:
Stack Overflow
Out of Memory
Virtual Machine (VM) Errors

Errors are considered unrecoverable, which means once they occur, the application cannot usually recover or continue execution in a meaningful way.

Example Classes:
StackOverflowError
OutOfMemoryError
InternalError
VirtualMachineError

These errors generally extend from the Error class, which is a subclass of Throwable.

Handling:
Errors should not be caught or handled in the same way as exceptions because they indicate serious problems that should ideally be fixed by modifying the code or the runtime environment.

Exception Handling:
Definition: Exceptions are issues that arise during the execution of an application and indicate unexpected situations that can often be managed and resolved within the application.

Characteristics:

Exceptions can occur due to a variety of reasons, such as invalid user input, failed database operations, or attempting to access a file that does not exist.
These are generally recoverable, meaning the application can catch the exception and either try an alternative solution or notify the user without crashing the entire program.

Example Classes:
FileNotFoundException
IOException
NullPointerException
SQLException
Exceptions extend from the Exception class, which is a subclass of Throwable.

Types of Exceptions:

Checked Exceptions:
These exceptions are checked at compile-time, and the programmer is required to handle them either with a try-catch block or by declaring them in the method signature using the throws clause.

Example Checked Exceptions:
IOException
SQLException
Handling: Declaring in the method signature or using try-catch blocks.

Unchecked Exceptions:
These are runtime exceptions that are not checked at compile-time. They occur due to programming errors, such as accessing null references or dividing by zero.

Example Unchecked Exceptions:
ArithmeticException
ArrayIndexOutOfBoundsException
NullPointerException

Handling: While not mandatory, handling runtime exceptions can prevent crashes.

try-catch Block

The try-catch block is the primary mechanism to handle exceptions in Java. It allows you to define code that might throw exceptions and specify how to handle them.

Syntax:
try {
    // Code that you want to execute, which might throw an exception
} catch (ExceptionType1 e) {
    // Code to handle ExceptionType1
} catch (ExceptionType2 e) {
    // Code to handle ExceptionType2
} catch (Exception e) {
    // Code to handle any other exceptions (generic handler)
} finally {
    // Code that will always run, whether an exception occurred or not
}

Components:

try block:
Contains the code that is expected to potentially throw an exception.
Only one try block is allowed.
This block should contain the "normal behavior" of the application, i.e., code that should run if everything goes as expected.

catch block:
Catches exceptions thrown by the try block.
Multiple catch blocks can be used to handle different exception types.
It is good practice to catch specific exceptions before using a general Exception catch-all.

finally block:
This block is optional.
Code in the finally block will always execute, regardless of whether an exception occurred or was handled.
Typically used for cleanup activities such as closing file streams or database connections.

throws Clause
The throws clause is used in a method declaration to specify which exceptions the method might throw during its execution.
This approach shifts the responsibility of handling the exception to the caller of the method.

Syntax:
public void someMethodName() throws NameOfException {
    // Code that may throw an exception
}

Example:
public void readFile() throws IOException {
    FileReader reader = new FileReader("file.txt");
    reader.read();
}

Here, the method readFile() declares that it can throw an IOException. It is up to the caller to handle it.

Best Practices for Error and Exception Handling:
Use specific exceptions where possible.
Catch specific exceptions before using a general Exception catch.
This makes debugging easier and prevents catching unexpected issues that might mask other errors.
Avoid catching Throwable or Error.
As mentioned, errors indicate serious problems that are beyond the application's control. Avoid handling them unless absolutely necessary.
Use finally for cleanup.
Use the finally block to release resources, like closing file streams, regardless of whether an exception occurred.
