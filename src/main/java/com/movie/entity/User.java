package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable{

    private static final long serialVersionUID = 168682349L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
    String lastName;

    @Column(name = "userName")
    String userName;

    @Column(name = "email")
    String email;

    @Column(name = "phone")
    String phone;

    @Column(name = "password")
    String password;

    @Column(name = "isAdmin")
    boolean isAdmin;

    @Column(name = "isActive")
    boolean isActive;

    @Column(name = "isMember")
    boolean isMember;

    @OneToMany(mappedBy = "user")
    private List<BookTicket> bookTickets;
}