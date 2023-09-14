package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_tickets")
public class BookTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_premiere")
    private Premiere premiere;

    @Column(name = "payment")
    private String payment;

    @ManyToOne
    @JoinColumn(name = "id_seat")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "id_service")
    private Services services;

    @Column(name = "isActive")
    private boolean isActive;
}