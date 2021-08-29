/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author patol
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType{
        Hospital("Hospital"),
        PublicityTeam("Publicity Team"),
        PlasmaBank("Plasma Bank"),
        Committee("Committee"),
        Transportation("Transportation");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
   //added 
    public enum Type{
        Laboratory("Central Laboratory"),Screening("Screening Organization"),Radiology("Radiology Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    //added
    public enum EnumType{
        Hospital("Hospital"), Doctor("Doctor Organization"), Reception("Reception Organization");
        private String value;
        private EnumType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType1{
        PublicityTeam("Publicity Team"), PublicityTeamAdmin("PublicityTeam Admin");
        private String value;
        private EnumType1(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public enum EnumType2{
         Committee("Committee"),CommitteeAdmin("CommitteeAdmin");
        private String value;
        private EnumType2(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public enum PlasmaType{
        PlasmaBank("Plasma Bank"),PlasmaBankAdmin("Plasma Bank Admin");
        private String value;
        private PlasmaType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
     
     public enum Transporatation{
        Transportation("Transportation"),
        TransporatationAdmin("Transporatation Admin");
        private String value;
        private Transporatation(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    
    
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
