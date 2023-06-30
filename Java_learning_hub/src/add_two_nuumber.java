// Java Program to Calculate the Sum of Two Numbers
// Author: Bamigboye Oluwapelumi

/*In Java, the `main` method is the entry point of a program. I
t is a special method that serves as the starting point of execution for a Java application. 
When the program is run, the Java Virtual Machine (JVM) looks for the `main` method to begin executing the code.

Let's break down the signature of the `main` method:

- `public`: It is an access modifier that specifies the visibility of the method. `public` means the method can be accessed from anywhere.
- `static`: It is a keyword that indicates that the method belongs to the class itself, rather than an instance of the class. The `main` method must be declared as `static` because it needs to be invoked without creating an instance of the class.
- `void`: It is the return type of the method. `void` means the method does not return any value.
- `main`: It is the name of the method. The JVM looks for a method with this exact signature to start executing the program.
- `String[] args`: It is the parameter of the method. It represents an array of strings that can be passed as command-line arguments to the program. The `args` parameter allows you to pass input values to the program when it is run.

Inside the `main` method, you write the code that will be executed when the program runs. It serves as the starting point of your program's logic. You can call other methods, perform calculations, manipulate data, and interact with the program's environment within the `main` method.

In the given code snippet, the `main` method is empty, meaning it does not contain any statements or instructions. This indicates that the program does not perform any specific actions when it runs. */
public class add_two_nuumber {
    public static void main(String[] args) {
        // Input numbers to be added
        int num1 = 10;
        int num2 = 20;
        
        // Calculate the sum
        int sum = num1 + num2;
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
