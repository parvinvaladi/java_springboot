package org.example.parking.parking;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends PagingAndSortingRepository<Parking,Long> {

    Parking findByNameOfParking(String name);
}
