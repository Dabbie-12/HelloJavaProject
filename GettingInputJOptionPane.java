import javax.swing.*;


public class GettingInputJOptionPane {
    public static void main(String[] args){
        //create a variable to store te username
        String userName = "";

        // ask the user for the name
        userName = JOptionPane.showInputDialog("please enter your name");

        //create the output massage
        String msg = "Hello " + userName + "!";

        // output the user data
        JOptionPane.showMessageDialog(null, msg);
    }
}