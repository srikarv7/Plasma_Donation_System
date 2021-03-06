/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Account.Account;
import javax.swing.JPanel;
import userInterface.HospitalAdminWorkSpace.HospitalAdminWorkArea;

/**
 *
 * @author srikar
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, ECOSystem business) {
        return new HospitalAdminWorkArea(userProcessContainer, enterprise);
    }
}

