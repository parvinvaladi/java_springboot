package org.example.parking.car;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CarRepository extends PagingAndSortingRepository<Car,Long> {

}
