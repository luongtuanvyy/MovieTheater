package com.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "auditorium")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "seats_no")
    private int seatsNo;

    @JsonIgnore
    @OneToMany(mappedBy = "auditorium")
    private Set<Seat> seats;

    @JsonIgnore
    @OneToMany(mappedBy = "auditorium")
    private Set<Screening> screenings;
}
