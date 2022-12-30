package org.example.parking.parking;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ParkingService implements IParkingService{

    private final ParkingRepository repository;

    @Override
    public Parking addParking(Parking parking) {

        Parking existingParking = repository.findByNameOfParking(parking.getNameOfParking());

        if(existingParking == null){
            return repository.save(parking);
        }else {
            throw new RuntimeException("this name exist");
        }
    }

    @Override
    public List<Parking> getAll() {
        return (List<Parking>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
         repository.delete(getById(id));
    }

    @Override
    public Parking getById(Long id) {
        Optional<Parking> optionalParking = repository.findById(id);
        return optionalParking.get();
    }
}
