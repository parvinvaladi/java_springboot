package org.example.parking.car;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/car")
public class CarController {

    private ICarService carService;
    private CarMapper mapper;

    @PostMapping(value = "/v1")
    public ResponseEntity<Void> save(@RequestBody CarDTO carDTO){
        Car car = mapper.convertToCar(carDTO);
        carService.save(car);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/v1/{id}")
    public ResponseEntity<CarDTO> getById(@PathVariable("id") Long id){
        Car car = carService.getById(id);
        CarDTO carDTO = mapper.convertToCarDTO(car);
        return ResponseEntity.ok(carDTO);
    }

    @GetMapping(value = "/v1")
    public ResponseEntity<List<CarDTO>> getAll(){
        List<Car> cars = carService.getAll();
        List<CarDTO> carDTOList = mapper.convertToCarDTOList(cars);
        return ResponseEntity.ok(carDTOList);
    }

    @PutMapping(value = "/v1/{id}")
    public ResponseEntity<CarDTO> update(@PathVariable Long id,CarDTO carDTO){
        Car car = mapper.convertToCar(carDTO);
        CarDTO updateCarDTO =mapper.convertToCarDTO(carService.update(car));
        return ResponseEntity.ok(updateCarDTO);

    }

    @DeleteMapping(value = "/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        carService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/v1/price/{id}")
    public ResponseEntity<Long> calculate(@PathVariable Long id){
        Long price = carService.calculate(id);
        return ResponseEntity.ok(price);
    }
}
