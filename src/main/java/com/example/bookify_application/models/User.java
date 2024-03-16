package com.example.bookify_application.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel{
    private String Username;
    private String email;

    private String password;//How is it being stored as a string when we are storing it in an
    // encrypted format using Bcrypt

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}
