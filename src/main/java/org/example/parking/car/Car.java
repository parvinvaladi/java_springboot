package org.example.parking.car;

import lombok.Data;
import org.example.parking.common.BaseEntity;
import org.example.parking.parking.Parking;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_car",uniqueConstraints = {@UniqueConstraint(columnNames = {"parking_id"})})
@Data
@Audited
public class Car extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "number")
    private String number; //شماره پلاک

    @ManyToOne
    @JoinColumn(name = "parking_id")
    private Parking parking;

    @Column(name = "model")
    private String model; // مدل ماشین

    @Column(name = "color")
    private String color;

    @Column(name = "entry_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTime; // date of entry

//    @Column(name = "exit_time")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date exitTime; // date of exit
}
