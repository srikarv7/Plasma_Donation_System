/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.TransportationAdminRole;
import java.util.ArrayList;

/**
 *
 * @author drrane
 */
public class TransportationAdminOrganization extends Organization{

    public TransportationAdminOrganization() {
        super(Organization.Type.TransportationAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportationAdminRole());
        return roles;
    }
    
}
     