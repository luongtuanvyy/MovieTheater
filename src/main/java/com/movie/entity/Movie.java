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
@Table(name ="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String age;

    @Column(name = "release_date")
    private Date releaseDate;

    private int time;

    private String description;

    private MovieType type;

    @OneToMany(mappedBy = "premiere")
    private List<Premiere> premieres;
}
