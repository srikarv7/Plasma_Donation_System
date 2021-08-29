/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        
        if (type.getValue().equals(Type.Reception.getValue())){
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }
        
      
        if (type.getValue().equals(Type.CommitteeAdmin.getValue())){
            organization = new CommitteeAdminOrganization();
            organizationList.add(organization);
        }
        
          if (type.getValue().equals(Type.PlasmaBankAdmin.getValue())){
            organization = new PlasmaBankOrganization();
            organizationList.add(organization);
        }
          
         if (type.getValue().equals(Type.TransportationAdmin.getValue())){
            organization = new TransportationAdminOrganization();
            organizationList.add(organization);
        }
         
          if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new DeliveryManOrganization();
            organizationList.add(organization);
        }
             if (type.getValue().equals(Type.PublicityTeamAdmin.getValue())){
            organization = new PublicityTeamOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}