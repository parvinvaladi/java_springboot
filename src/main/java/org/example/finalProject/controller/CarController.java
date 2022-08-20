package org.example.finalProject.controller;

import lombok.AllArgsConstructor;
import org.example.finalProject.DTO.CarDTO;
import org.example.finalProject.mapper.CarMapper;
import org.example.finalProject.model.Car;
import org.example.finalProject.service.ICarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car/v1")
@AllArgsConstructor
public class CarController {
    private ICarService carService;
    private CarMapper carMapper;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody CarDTO carDTO){
        Car car = carMapper.toCar(carDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
