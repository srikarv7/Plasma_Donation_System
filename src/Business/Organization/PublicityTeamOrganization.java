/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AwarenessRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author drrane
 */
public class PublicityTeamOrganization extends Organization{

    public PublicityTeamOrganization() {
        super(Organization.Type.PublicityTeamAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AwarenessRole());
        return roles;
    }
}
     
