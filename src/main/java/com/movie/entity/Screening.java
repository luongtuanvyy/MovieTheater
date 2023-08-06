package com.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "screening")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Screening implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "screening_start")
    private Date screeningStart;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "auditorium_id")
    private Auditorium auditorium;

    @JsonIgnore
    @OneToMany(mappedBy = "screening")
    private Set<Reservation> reservations;

    @JsonIgnore
    @OneToMany(mappedBy = "screening")
    private Set<SeatReserved> seatReserveds;
}
