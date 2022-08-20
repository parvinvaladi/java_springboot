package org.example.finalProject.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "parking")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "owner")
    private String ownerName;

    @NotNull
    @Column(name = "brand")
    private String brand;

    @NotNull
    @Column(name = "color")
    private String color;

    @NotNull
    @Column(name = "hour_entry")
    private Integer hourOfEntry;

    @NotNull
    @Column(name = "minute_entry")
    private Integer minuteOfEntry;

    @NotNull
    @Column(name = "hour_exit")
    private Integer hourOfExit;

    @NotNull
    @Column(name = "minute_exit")
    private Integer minuteOfExit;

}
