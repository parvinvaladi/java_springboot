package org.example.finalProject.mapper;

import org.example.finalProject.DTO.ParkingDTO;
import org.example.finalProject.model.Parking;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParkingMapper {
    ParkingDTO toParkingDTO(Parking parking);
    Parking toParking(ParkingDTO parkingDTO);
    List<Parking> toParkingList(List<ParkingDTO> parkingDTOS);
    List<ParkingDTO> toParkingDTOList(List<Parking> parkings);
}
