package org.example.parking.car;

import java.util.Date;
import java.util.List;

public interface ICarService {

    Car save(Car car);
    Car getById(Long id);
    List<Car> getAll();
    Car update(Car car);
    void delete(Long id);
    Long calculate(Long id);
}
