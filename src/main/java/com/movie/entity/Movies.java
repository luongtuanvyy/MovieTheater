package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class Movies implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "time")
    private int time;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "movies")
    private List<Premiere> premieres;


}
