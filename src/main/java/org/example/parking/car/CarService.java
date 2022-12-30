package org.example.parking.car;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
public class CarService implements ICarService{

    CarRepository repository;
    @Override
    public Car save(Car car) {
        return repository.save(car);
    }

    @Override
    public Car getById(Long id) {
        Optional<Car> optionalCar = repository.findById(id);
        if(!optionalCar.isPresent()){
            throw new NotFoundException("the car not found");
        }
        return optionalCar.get();
    }

    @Override
    public List<Car> getAll() {
        return (List<Car>) repository.findAll();
    }

    @Override
    public Car update(Car car) {
        Long id = car.getId();
        Car lastSevedCar = getById(id);
        // BeanUnit.copyProperties(car , lastSavedCar);
        lastSevedCar.setFirstName(car.getFirstName());
        lastSevedCar.setLastName(car.getLastName());
        lastSevedCar.setNumber(car.getNumber());
        lastSevedCar.setModel(car.getModel());
        lastSevedCar.setColor(car.getColor());
        return lastSevedCar;
    }

    @Override
    public void delete(Long id) {
        Car car = getById(id);
        repository.delete(car);
    }

    @Override
    public Long calculate(Long id) {
        Car car = getById(id);
        Date entry = car.getEntryTime();
        Date exit = new Date();
        long difference = TimeUnit.MILLISECONDS.toHours(exit.getTime() - entry.getTime());
        long cost = difference * 2000;
        return cost;
    }
}
