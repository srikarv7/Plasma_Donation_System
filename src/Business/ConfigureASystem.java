package Business;

import Business.Account.Account;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;

/**
 *
 * @author TEJAL
 */
public class ConfigureASystem {
    
    public static ECOSystem configure(){
        
        ECOSystem system = ECOSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        Account ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
