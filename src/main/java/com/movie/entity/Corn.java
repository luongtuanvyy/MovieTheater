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
@Table(name = "corn")
public class Corn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private String price;

    @OneToMany(mappedBy = "corn")
    private List<Services> services;
}