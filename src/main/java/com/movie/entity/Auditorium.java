package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "auditorium")
public class Auditorium implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "size")
    private String size;

    @Column(name = "col")
    private String col;

    @Column(name = "rowseat")
    private String rowSeat;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;

    @OneToMany(mappedBy = "auditorium")
    private List<Premiere> premieres;

    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seat;
}
