package com.solidWaste_backend.SolidWasteApp.model;


import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_user")
    int idUser;

    @Column (name = "email", unique = true, nullable = false)
    String email;

    @Column (name = "password_user", nullable = false)
    String passwordUser;

    @Column (name = "dni_user", unique = true)
    String dni;

    @Column(name = "phone_user")
    String phone;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id_location")
    Location location;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", email='" + email + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", dni='" + dni + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                '}';
    }
}
