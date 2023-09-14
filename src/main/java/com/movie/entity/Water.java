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

    @Column(name = "type")
    private String type;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private String price;

    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany(mappedBy = "water")
    private List<Services> services;
}