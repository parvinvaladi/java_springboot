package org.example.finalProject.mapper;

import org.example.finalProject.DTO.CarDTO;
import org.example.finalProject.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDTO toCarDTO(Car car);
    Car toCar(CarDTO carDTO);
    List<CarDTO> toCarDTOList(List<Car> carList);
    List<Car> toCarList(List<CarDTO> carDTOList);
}
