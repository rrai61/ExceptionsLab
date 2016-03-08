package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) throws IllegalArgumentException{
        String fullNameInCaps = "Unknown";
        Employee emp = null;
        
        // Think about this code. It wouldn't work if lastName was null
        try{
            emp = new Employee("Jim","","3333333333",28);
            fullNameInCaps = emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fullNameInCaps);

    }
}
