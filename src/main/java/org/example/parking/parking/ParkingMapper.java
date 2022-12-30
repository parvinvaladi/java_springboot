package org.example.parking.parking;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParkingMapper {

    ParkingDTO toParkingDTO(Parking parking);
    Parking toParking(ParkingDTO parkingDTO);
    List<Parking> toParkingList(List<ParkingDTO> parkingDTOList);
    List<ParkingDTO> toParkingDTOList(List<Parking> parkingList);
}
