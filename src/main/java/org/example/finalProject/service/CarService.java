package org.example.finalProject.service;

import lombok.AllArgsConstructor;
import org.example.finalProject.model.Car;
import org.example.finalProject.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarService implements ICarService{
    private final CarRepository repository;
    @Override
    public Car save(Car car) {

        return null;
    }
}
