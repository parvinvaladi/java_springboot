package org.example.parking.parking;

import java.util.List;

public interface IParkingService {

    Parking addParking(Parking parking);
    List<Parking> getAll();
    void delete(Long id);
    Parking getById(Long id);
}
