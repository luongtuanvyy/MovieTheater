package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book_tickets")
public class BookTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
//    @Column(name = "size")
//    private String user_id;
//    @Column(name = "size")
//    private String premiere_id;
    @Column(name = "payment")
    private String payment;
    @Column(name = "price")
    private String price;
//    @Column(name = "seat_id")
//    private Double seat_id;
//    @Column(name = "service_id")
//    private boolean service_id;
}
