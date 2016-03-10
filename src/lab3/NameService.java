package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
        private static final int MIN_WORD_COUNT = 2;
        private static final String SPACE= " ";

    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{
        String lastName = null;
        String[] nameString = null;
        
        
        if(fullName == null || fullName.isEmpty() || fullName.split(SPACE).length < MIN_WORD_COUNT ) {
            throw new IllegalFullNameException();
        }

        nameString = fullName.split(SPACE);
        lastName = nameString[nameString.length-1];
        
        return lastName;
    }
    
}
