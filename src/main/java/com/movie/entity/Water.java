package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "water")
public class Water {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String type;

    private String size;

    private String price;

    @OneToMany(mappedBy = "corn")
    private List<Services> services;
}
