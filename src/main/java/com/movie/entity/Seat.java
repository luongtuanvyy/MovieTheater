package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "seat")
public class Seat implements Serializable {

    private static final long serialVersionUID = 34558756L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_auditorium")
    private Auditorium auditorium;

    @Column(name = "rowseat")
    private String rowSeat;

    @Column(name = "col")
    private String col;

}
