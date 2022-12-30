package org.example.parking.car;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.parking.parking.ParkingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-30T19:52:36+0330",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Autowired
    private ParkingMapper parkingMapper;

    @Override
    public Car convertToCar(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setEntryTime( timestampToDate( carDTO.getEntryTime() ) );
        car.setId( carDTO.getId() );
        car.setVersion( carDTO.getVersion() );
        car.setCreatedDate( carDTO.getCreatedDate() );
        car.setCreatedBy( carDTO.getCreatedBy() );
        car.setLastModifiedDate( carDTO.getLastModifiedDate() );
        car.setLastModifiedBy( carDTO.getLastModifiedBy() );
        car.setFirstName( carDTO.getFirstName() );
        car.setLastName( carDTO.getLastName() );
        car.setNumber( carDTO.getNumber() );
        car.setParking( parkingMapper.toParking( carDTO.getParking() ) );
        car.setModel( carDTO.getModel() );
        car.setColor( carDTO.getColor() );

        return car;
    }

    @Override
    public CarDTO convertToCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setEntryTime( dateToTimestamp( car.getEntryTime() ) );
        carDTO.setId( car.getId() );
        carDTO.setVersion( car.getVersion() );
        carDTO.setCreatedDate( car.getCreatedDate() );
        carDTO.setCreatedBy( car.getCreatedBy() );
        carDTO.setLastModifiedDate( car.getLastModifiedDate() );
        carDTO.setLastModifiedBy( car.getLastModifiedBy() );
        carDTO.setFirstName( car.getFirstName() );
        carDTO.setLastName( car.getLastName() );
        carDTO.setNumber( car.getNumber() );
        carDTO.setParking( parkingMapper.toParkingDTO( car.getParking() ) );
        carDTO.setModel( car.getModel() );
        carDTO.setColor( car.getColor() );

        return carDTO;
    }

    @Override
    public List<Car> convertToCarList(List<CarDTO> carDTOList) {
        if ( carDTOList == null ) {
            return null;
        }

        List<Car> list = new ArrayList<Car>( carDTOList.size() );
        for ( CarDTO carDTO : carDTOList ) {
            list.add( convertToCar( carDTO ) );
        }

        return list;
    }

    @Override
    public List<CarDTO> convertToCarDTOList(List<Car> carList) {
        if ( carList == null ) {
            return null;
        }

        List<CarDTO> list = new ArrayList<CarDTO>( carList.size() );
        for ( Car car : carList ) {
            list.add( convertToCarDTO( car ) );
        }

        return list;
    }
}
