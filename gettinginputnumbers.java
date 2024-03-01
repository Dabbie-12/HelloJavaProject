import java.io.*;


public class gettinginputnumbers {
    /**
     * getting user input
     * we have two ways
     *
     * 1.bufferdreader class ->console line way
     * 2. JOptionpane ->GUI(graphical user interface)
     *
     */

    public static void main(String[] args){
        //lets get user input using BufferedReader class

        //create an instance of bufferredreader class
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String userName = "";

        //catch a variable for holding te user input String username = null;

        //Use a try ... catch block to execute the code
        try {
            //ask the user for their name
            System.out.println("please enter your name; ");
            dataIn.readLine();
        } catch (IOException ex) {
            System.out.println("there was an error reading in user input,,,");
        }

        //output the user input
        System.out.println("greetings " + userName);

        //write a java program that asks the user  for their name and age. then converts the age into minutes the user has lived.

        String name = "";
        int age = 0;

        try {
            System.out.print("enter your name: ");
            name = dataIn.readLine();
            System.out.print("enter your too: ");
            age = dataIn.read();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //covert the user age into minutes
        int ageInMinutes = age * 365 * 24 * 60;

        //out the user info
        System.out.println("hello " + name + " , you have lived for " + ageInMinutes + " minutes.");
    }
}
