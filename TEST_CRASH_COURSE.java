// This is a single line commnet
// These comments are only allowed to be on one line

/*
This is a multi-line comment
These comments are comments that can be on multiple lines
as long as they are within the symbols from above and below
*/

// Comments are notes within code that wont be executed by
//   the program

// A block of code is code between curly braces ( {} )

// We use semi-colans (;) to end a command 
// - Like a period in a sentence.

// Public - the block of code can be access through the entire file
// Class - a block of code that contains functions

// We name the class the SAME as the file name
public class Main {
    // static - access a block of code without declaring the
    //    function
    
    // void - this a return type meaning we are not expecting
    //  the function to return anything.
    public static void main(String[] args) {
        /*
        There are different datatypes
        Strings - String - sentences
        Characters - char - single characters
        Integers - int - numbers with NO decimals
        Doubles - double - numbers WITH decimals
        Boolean - boolean - true or false (yes or no)
        */
        
        // -- PRINTING --
        
        // System - A builtin class in java
        // out - A buildin class in System
        // println() - a function in the 'out' class
        // -- This function requires one input - a datatype
        
        System.out.println("Hello, world");
        System.out.println(12345);
        
        // -- VARIABLES --
        
        // (datatype) (name) = (value)
        
        // String are declared by having quotations ("")
        String firstname = "JohnDoe123";
        // Char are declared by having single qutations ('')
        char PlayerCharacter = '@';
        int playerAge = 16;
        double price_of_bread = 2.99;
        boolean is_alive = true;
        
        // -- CASTING --
        // Allows the developer to change a datatype to another
        
        // casting is (datatype) (variable_name)
        
        // (datatype) (name) = (casting datatype) (casting name)
        
        //EXAMPLE: double var = double 3;
        
        int c = 5;
        double d = (double)c; 
        
        System.out.println(c);
        System.out.println(d);
        
        // -- MATH --
        /*
        There are different types of math operations
            - (+) - addition
            - (-) - subtraction
            - (*) - multiplication
            - (/) - division
            - (%) - modulus
        */
        
        double a = 1.0;
        double b = 2.0;
        
        double addition_result = a + b;
        double subtraction_result = a - b;
        double multiplication_result = a * b;
        double division_result = a / b;
        double modulus_result = a % b;
        
        System.out.println(addition_result);
        System.out.println(subtraction_result);
        System.out.println(multiplication_result);
        System.out.println(division_result);
        System.out.println(modulus_result);
        
        // -- CONCATINATION -- COMBINGING STRINGS --
        // We could combine strings together - AMAZING!
        // Combine strings by adding them together
        String first = "Bob";
        String last = "Martain";
        
        String fullname = first + " " + last;
        System.out.println(fullname);
        
        // Lets see a pratical use
        int score = 5;
        System.out.println("Your score is: " + score);
        
        // -- IF STATEMENTS --
        /*
        If statements allows the developer to check to see if a condition is true
        
        if (condition) {
            code (IF CONDITION IS TRUE)
        } else if (condition) {
            code (IF PREVIOUS CONDITIONS ARE FALSE AND THIS IS TRUE)
        } else {
            code (IF ALL CONDITIONS PREVIOUS TO THIS ONE IS FALSE)
        };
        */
        
        int correct_number = 5;
        int guess_1 = 2;
        int guess_2 = 3;
        int guess_3 = 5;
        
        if (guess_1 == correct_number) {
            System.out.println("Guess 1 correct");
        } else if (guess_2 == correct_number) {
            System.out.println("Guess 2 correct");
        } else if (guess_3 == correct_number) {
            System.out.println("Guess 3 correct");
        } else {
            System.out.println("All guesses are not correct");
        };
        
        // -- COMPARISION OPERATORS --
        /*
        We use these to compare to values
        
        OPERATORS:
        Greater Than ( > )
        Less Than ( < )
        
        Greater than or equal to ( >= )
        Less than or equal to ( <= )
        
        equal to ( == )
        */
        
        boolean is_true_1 = a > b;
        boolean is_true_2 = a < b;
        boolean is_true_3 = a >= b;
        boolean is_true_4 = a <= b;
        boolean is_true_5 = a == b;
        
        System.out.println("Is true 1: " + is_true_1);
        System.out.println("Is true 2; " + is_true_2);
        System.out.println("Is true 3: " + is_true_3);
        System.out.println("Is true 4: " + is_true_4);
        System.out.println("Is true 5: " + is_true_5);
        
        // -- LOGICAL OPERATIONS
        
        /*
        These allows us to compare two or more boolean values
        
        LOGICAL OPERATIONS
        AND - if A is TRUE AND b is TRUE ( && ) - A && B
        OR - if A is TRUE OR b is TRUE ( || ) - A || B
        NOT if A is TRUE, then it would be false (!) - !A
        */
        
        boolean is_true_6 = a > b && a < b;
        System.out.println(is_true_6);
        
        // -- While Loops
        /*
        While loops allows the developer to continue running a block code until the condition if false
        
        we exit out of while loops by using the "break" command
        
        we stop a loop and go back to the beginning of the loop with the "continue" command
        */
        
        int number = 5;
        while (number > 1) {
            System.out.println("WHILE LOOP NUMBER: " + number);
            number = number - 1;
        };
        
        // -- For Loops
        /*
        We can execute a block of code for a certain number of times.
        
        all rules apply with the 'break' and 'continue' from the while loop chapter
        
        here is how it works
        for (variable; condition; do something with variable) {
            code (KEEP RUNNING UNTIL CONDITION IF FALSE)
        };
        */
        
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("FOR LOOP NUMBER: " + i);
        };
    };
};


// END OF FILE
