package com.solidWaste_backend.SolidWasteApp.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    int idEmployee;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password_employee", nullable = false)
    private String password;

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwordEmployee) {
        this.password = passwordEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", email='" + email + '\'' +
                ", passwordEmployee='" + password + '\'' +
                '}';
    }
}
