# cs61B-18-spring

## Wk1:

### Java

All code must live inside a class in Java.

1. All code in Java must be part of a class.
2. We delimit the beginning and end of segments of code
    using { and }.
3. All statements in Java must end in a semi-colon.
4. For code to run we need public static void main(String[])

1. Before Java variables can be used, they must be declared.
2. Java variables must have a specific type.
3. Java variable types can never change.
4. Types are verified before the code even runs!

1. Functions must be declared as part of a class in Java.
   A function that is part of a class is called a "method".
   Sp in Java, all functions are methods.
2. To define a function in Java, we use "public static"
   We will see alternate ways of defining functions later.
3. All parameters of a function must have a declared type, 
   and the return value of the function must have a declared type.
4. Functions in Java return only one value.

Java is an object oriented language with strict requirements.
- Every Java file must contain a class declaration.
- All code lives inside a class*, even helper functions, global constants, etc.
- To run a Java program, you typically define a main method using public static void main(String[] args).

Java is statically typed.
- All variables, parameters, and methods must have a declared type.
- That type can never change.
- Expressions always have a declared type.
- The compiler checks that all the types in program are compatible before the program ever runs.
    - This is unlike Python, where type checks are performed during execution.

Reflections on Static Typing:
The Good:
    - Catches certain types of errors, making it easier on the programmer to debug.
    - Type errors can (almost) never occur on the end user's computer.
    - Makes it easier to read and reason about code.
    - Code can run more efficiently, e.g. no need to do expensive runtime type checks.
The Bad:
    - Code is more verbose.
    - Code is less general. There is a way around this called **generics**.



