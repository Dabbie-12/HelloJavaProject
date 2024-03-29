import java.util.Scanner;

public class RepetitionStructures {

    public static void main(String[] args) {


        // 1. while-loop -> is a statement or block of code that is repeated as long as some condition is satisfied.

        // while loop has the form (syntax)

        // while (boolean_expression) {
        //    statement1;
        //    statement2;
        // }

        // The statements inside the while loop are executed as long as the boolean_expression evaluates to true

        // Example:
        // write a while loop that prints the integers 1 2 3 4 5 6 7 8 9 10
        int x = 1;

        // repeat as long as the value of x is less than or equal to 10
        while (x < 11) {
            System.out.println(x);
            // x++;
            // x += 1;
            x = x + 1;
        }
        System.out.println("======================================================");

        // output: 0 2 4 6 8 10 12 14 16 18 20
        int i = 0;

        while (i < 21) {
            System.out.println(i);
            // i = i + 2;
            i += 2;
        }
        System.out.println("======================================================");

        // Output: 15 12 9 6 3 0 -3 -6 -9 -12 -15

        int k = 15;

        while (k >= -15) {
            System.out.println(k);
            k = k - 3;
        }
        System.out.println("======================================================");

        // 2. do ... while
        // statements inside a do-while loop are executed several times as long as the condition is satisfied(true)

        // it is similar to a while loop, the main difference is that statements inside a so-while loop are executed at least once

        // syntax

        // do {
        //     statement1;
        //     statement2;
        // } while (boolean_expression);

        // output: 1 2 3 4 5 6 7 8 9 10

        int m = 1;

        do {
            System.out.println(m);
            m++;
        } while (m <= 10);

        System.out.println("======================================================");

        // 0 5 10 15 20 25 30 35 40 45 50
        // 50 45 40 35 30 25 20 15 10 5 0

        // tomorrow -> for-loop
        // 3. for loop
        // a for-loop allows execution of the same code a number of times.

        // for-loop syntax

        // for (InitializeExpression; loopCondition; StepExpression){
        //    statement1;
        //    statement2;
        // }
        // where;
        // -> InitializationExpression: initialize the loop variable
        // -> LoopCondition: compares the loop variable to some limit
        // -> StepExpression: updates the loop variable

        // e.g
        // output : 1 2 3 4 5 6 7 8 9 10
        for ( int c = 1; c < 11; c++) {
        System.out.println(c);
        }
        System.out.println("======================================================");


        // Branching Statement
        // -> allows us to redirect the flow of programs

        // i. break
        // ii. continue
        // iii. return

        // i. break statements
        // terminates the enclosing switch statement, and flow of control transfers to the statement immediately following the switch.
        // This can also be used to terminate a for, while or do-while loop

        String[] studentNames = {"Joanah", "Bradely", "Muzna", "Hamza", "Phill", "Yasmin"};

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of who you be searching for: ");
        String searchName = sc.next();
        boolean foundName = false;
        for (int idx = 0; idx < studentNames.length; idx++) {
            if (studentNames[idx] .equals( searchName)) {
                foundName = true;
                break;
            }
        }

        if (foundName == true) {
            System.out.println(searchName  +  " found!");
        } else {
            System.out.println(searchName  +  " not found!");
        }
        System.out.println("======================================================");

        // ii. continue statement
        // skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop, basically skipping the remainder of this iteration of the loop

        // Example:
        String[] names = {"Bitchy", "Bolin", "Lancey", "Bitchy"};

        int count = 0;
        for (int p = 0; p < names.length; p++){
            if (names[p].equals("Bitchy")){
                continue; // skip next statement
            }
            count++;
        }

        System.out.println("There are "  +  count  +  " Bitchys in this list.");

        System.out.println("======================================================");

        // nested for loop
        // create a times table for a user provided number

        System.out.println("======================================================");

        // ask the user for the times table number
        System.out.print("Enter the times table number: ");
        int timesTable = sc.nextInt();

        for (int times = 1; times <= 12; times++){
            System.out.println(timesTable + " X " + times + " = " + timesTable * times);
        }

        // create the whole times table

        for (int q = 1; q <= 12; q++){
            for (int r = 1; r <= 20; r++){
                System.out.println(q + " X " + r + " = " + (q * r));
            }
            System.out.println("--------------------------------------------------------------------------------");
        }

        System.out.println("======================================================");

        // iii. return statement
        // used to exit from the current method
        // flow of control returns to the statement that follows the original method call.
        // to return, simply put the value (or an expression that circulates the value) after the return keyword
        // For example:
        // return count++; or return "java";
        //the type of data declared by the method MUST match the type of value returned by the return statement.
        // when a method is declared void, use the form of return that doesn't return a value.
        // For example return;
        // We will cover more about return statements discuss

        //close our scanner object
        sc.close();
    }
}
