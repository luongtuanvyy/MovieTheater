package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="premiere")
public class Premiere implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name="id_movies")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="id_auditorium")
    private Auditorium auditorium;

    @Column(name = "time")
    private Date time;

    @Column(name = "price")
    private Double price;

    @Column(name = "active")
    private boolean active;

    @OneToMany(mappedBy = "premiere")
    private List<BookTicket> bookTickets;

}
