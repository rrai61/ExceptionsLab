package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    private final int MIN_NAME_LENGTH = 5;
    private final int MAX_NAME_LENGTH = 41;
    private String[] nameString = {"empty", "empty"};
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    
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
