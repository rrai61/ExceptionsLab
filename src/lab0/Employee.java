package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private final int MIN_FIRSTNAME_LENGTH = 2;
    private final int MAX_FIRSTNAME_LENGTH = 20;
    private final int MIN_LASTNAME_LENGTH = 2;
    private final int MAX_LASTNAME_LENGTH = 20;
    private final int MIN_NUM_DAYSVACATION = 0;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }
    
    // cannot be less than the minimum number of vacation days
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException{
         if(daysVacation < MIN_NUM_DAYSVACATION) {
            throw new IllegalArgumentException("Sorry daysVacation is mandatory and must not be less than "
                    +MIN_NUM_DAYSVACATION);
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
    
    // cannot be null or an empty string. must be between the minimum length and maximum length for first name
    public final void setFirstName(String firstName) throws IllegalArgumentException{
        if(firstName == null || firstName.isEmpty() || firstName.length() < MIN_FIRSTNAME_LENGTH  || 
                firstName.length() > MAX_FIRSTNAME_LENGTH ) {
            throw new IllegalArgumentException("Sorry firstName is mandatory and must be between " 
                    + MIN_FIRSTNAME_LENGTH +" and " + MAX_FIRSTNAME_LENGTH +" characters in length");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }
    
    // cannot be null or an empty string. must be between the minimum length and maximum length for last name
    public final void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName == null || lastName.isEmpty() || lastName.length() < MIN_LASTNAME_LENGTH 
                || lastName.length() > MAX_LASTNAME_LENGTH) {
            throw new IllegalArgumentException("Sorry lastName is mandatory and must be between " 
                    + MIN_LASTNAME_LENGTH +" and " + MAX_LASTNAME_LENGTH +" characters in length");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    
    // needs validation
    public final void setSsn(String ssn){
        
        this.ssn = ssn;
    }
    
    
    
}
