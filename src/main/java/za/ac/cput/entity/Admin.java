/*
Admin.java
Entity for the Admin
Author: Ameer Samsodien (220005060)
Date : 27 March 2022
*/

package za.ac.cput.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Admin {

    @Id
    @NotNull
    private String adminNum;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNum;

    protected Admin(){

    }

    private Admin(Builder builder){
        this.adminNum = builder.adminNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNum = builder.phoneNum;
    }

    public String getAdminNum(){return adminNum;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmail(){return email;}
    public String getPhoneNum(){return phoneNum;}

    @Override
    public String toString() {
        return "Admin{" +
                "adminNum='" + adminNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public static class Builder{
        private String adminNum;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNum;

        public Builder setAdminNum(String adminNum){
            this.adminNum = adminNum;
            return this;
        }

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPhoneNum(String phoneNum){
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder copy(Admin admin){
            this.adminNum = admin.adminNum;
            this.firstName = admin.firstName;
            this.lastName = admin.lastName;
            this.email = admin.email;
            this.phoneNum = admin.phoneNum;
            return this;
        }

        public Admin build(){return new Admin(this);}
    }

}
