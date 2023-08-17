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
    @JoinColumn(name = "id_water")
    private Corn corn;

    private int quantity_corn;

    @ManyToOne
    @JoinColumn(name = "id_water")
    private Water water;

    private int quantity_water;

    @OneToMany(mappedBy = "bookTickets")
    private List<BookTicket> bookTickets;
}
