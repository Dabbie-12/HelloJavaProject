import java.util.Scanner;

public class DesicionControlStructures {
    /**
     * Decision Control Structures
     *
     * These are java statements that allows us to select and execute specific blocks of code while skipping
     *
     * There are three types:
     *
     * i. if statement
     * ii. if-else statement
     * iii. if-else-if statement
     */

    public static void main(String[] args){
        // i. if statement
        //specifies that a statement (or a block of code) will be executed if only a certain boolean statement is true.

        // syntax
        // if (boolean_expression)
        //      statement

        // or

        // if (boolean-expression){
        //      statement1;
        //      statement2;
        // }

        // where ;
        // -> boolean-expression is either a boolean expression or boolean variable.

        // Example:
        int grade = 68;

        // print congratulations if grade is greater than 60
        if (grade > 60)
            System.out.println("Congratulations!");

        if (grade > 60){
            System.out.println("congratulations!");
            }

        if (grade > 60){
            System.out.println("Congrats! You Passed");
        }

        System.out.println("=========================");

        // ii. if-else statement
        // used when we want to execute a certain statement if a condition is true and a different statement if the condition is false.

        // syntax
        // if (boolean-expression){
        //      statement1;
        //      statement2
        // } else {
        // statement3;
        // statement4;
        // }

        int mark = 74;
        if(mark > 70) {
            System.out.println("wrong answer");
        } else {
            System.out.println("dunno");
        }

        // iii. if-else-if-else statement
        // the statement in the else block of an if-else block can be treated as an if-else structures
        // this cascading of structures allow us to make more complex selections
        // used to execute multiple courses of action.

        // syntax

        if (grade > 90){
            System.out.println("Excellent");
        } else if (grade > 60) {
            System.out.println("Very good");
        } else  {
            System.out.println("Sorry You Failed");
        }
        // Switch Statement
        // a switch allows branching on multiple outcomes
        // it has the following form (syntax)

        // switch (switch_expression) {
        //    case case_selector1:
        //        statement1;
        //        statement2;
        //        break;
        //    case case_selector2:
        //        statement1;
        //        statement2;
        //        break;
        //    default:
        //        statement1;
        //        statement2;
        // }
        // where:
        // -> switch_expression: is an integer, or character expression
        // -> case_selector1, case_selector2 and so on: are unique integer or character constants

        // When a switch statement is encountered:-
        // Java first evaluates the switch_expression, and jumps to the case whose selector matches the value of the expression.

        // The program executes the statements in order from that point on until a break statement is encountered, skipping then to the first statement after the end of the switch structure.
        // if none of the cases are satisfied, the default block is executed. Take note however, that the default part is optional

        // NOTE:
        // Unlike with the if statement, the multiple statements are executed in the switch statement without needing the curly braces.

        // when a case in a switch statement has been matched, all the statements associated with that case are executed. Not only that, the statements associated with succeeding cases are also executed.
        // To prevent the program from executing statements in the subsequent cases, we use a break statement as our last statement.
        int score = 90;

        switch (score) {
            case 100:
                System.out.println("Excellent!");
                break;
            case 90:
                System.out.println("Good Job!");
                break;
            case 80:
                System.out.println("Study Harder");
                break;
            default:
                System.out.println("Sorry, You Failed.");
        }
        // create a java program using switch statement that asks the user for an integer between 1 and 7 inclusive and then outputs the day of the week e.g. if the user entered 1, then output "Sunday"

        Scanner sc = new Scanner(System.in);
        int days = 0;


        switch (days){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
        }

    }
}
