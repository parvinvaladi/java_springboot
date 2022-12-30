package org.example.parking.parking;

import lombok.Data;
import org.example.parking.car.Car;
import org.example.parking.common.BaseEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_parking")
@Audited
@Data
public class Parking extends BaseEntity {

    @Column(name = "name_of_parking")
    private String nameOfParking;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "parking",cascade = CascadeType.ALL)
    private List<Car> cars;
}
