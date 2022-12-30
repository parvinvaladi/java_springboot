package org.example.parking.car;

import org.example.parking.parking.ParkingMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring",uses = {ParkingMapper.class})
public interface CarMapper {

    @Mappings({
            @Mapping(source = "entryTime",target = "entryTime",qualifiedByName = "timestampToDate")
    })
    Car convertToCar(CarDTO carDTO);

    @Mappings({
            @Mapping(source = "entryTime",target = "entryTime",qualifiedByName = "dateToTimestamp")
    })
    CarDTO convertToCarDTO(Car car);
    List<Car> convertToCarList(List<CarDTO> carDTOList);
    List<CarDTO> convertToCarDTOList(List<Car> carList);


    @Named("timestampToDate")
    default Date timestampToDate(Long timestamp){
        if(timestamp != null)
            return new Date(timestamp);

        return null;
    }

    @Named("dateToTimestamp")
    default Long dateToTimestamp(Date date){
        if(date != null)
            return date.getTime();

        return null;
    }

}
