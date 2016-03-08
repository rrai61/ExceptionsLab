package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    private final int MIN_NAME_LENGTH = 5;
    private final int MAX_NAME_LENGTH = 41;
    private String[] nameString = {"empty", "empty"};
    
    public static void main(String[] args) throws IllegalArgumentException{
        Challenge1 app = new Challenge1();
        String fullName = "unknown";
        String lastName = "unknown";
        
        try{
        fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        lastName = app.extractLastName(fullName);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception the calling method. and handle
    // it there.
    
    // full name cannot be null or an empty string. must be greater than the minimum length for full name
    public String extractLastName(String fullName) throws IllegalArgumentException{
        if(fullName == null || fullName.isEmpty() || fullName.length() < MIN_NAME_LENGTH  || 
                fullName.length() > MAX_NAME_LENGTH ) {
            throw new IllegalArgumentException("Sorry name is mandatory and must be between " 
                    + MIN_NAME_LENGTH +" and " + MAX_NAME_LENGTH +" characters in length");
        }
        // Your code goes here. Assign your value to lastName
        nameString = fullName.split(" ");
        String lastName = nameString[LAST_NAME_IDX];
        
        return lastName;
    }

}
