package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_corn")
    private Corn corn;

    @Column(name = "quantity_corn")
    private int quantityCorn;

    @ManyToOne
    @JoinColumn(name = "id_water")
    private Water water;

    @Column(name = "quantity_water")
    private int quantityWater;

    @OneToMany(mappedBy = "services")
    private List<BookTicket> bookTickets;
}
