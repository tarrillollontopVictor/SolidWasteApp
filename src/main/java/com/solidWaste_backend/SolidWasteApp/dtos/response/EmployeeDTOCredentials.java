package com.solidWaste_backend.SolidWasteApp.dtos.response;


public class EmployeeDTOCredentials{

   private String email;
   private String passwordEmployee;



   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPasswordEmployee() {
      return passwordEmployee;
   }

   public void setPasswordEmployee(String passwordEmployee) {
      this.passwordEmployee = passwordEmployee;
   }

   @Override
   public String toString() {
      return "EmployeeDTOCredentials{" +
              "email='" + email + '\'' +
              ", passwordEmployee='" + passwordEmployee + '\'' +
              '}';
   }
}
