package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "time")
    private int time;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "movie")
    private List<Premiere> premieres;
}
