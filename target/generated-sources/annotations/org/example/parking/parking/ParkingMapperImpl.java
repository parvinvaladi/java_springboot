package org.example.parking.parking;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-30T19:52:36+0330",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ParkingMapperImpl implements ParkingMapper {

    @Override
    public ParkingDTO toParkingDTO(Parking parking) {
        if ( parking == null ) {
            return null;
        }

        ParkingDTO parkingDTO = new ParkingDTO();

        parkingDTO.setId( parking.getId() );
        parkingDTO.setVersion( parking.getVersion() );
        parkingDTO.setCreatedDate( parking.getCreatedDate() );
        parkingDTO.setCreatedBy( parking.getCreatedBy() );
        parkingDTO.setLastModifiedDate( parking.getLastModifiedDate() );
        parkingDTO.setLastModifiedBy( parking.getLastModifiedBy() );
        parkingDTO.setNameOfParking( parking.getNameOfParking() );

        return parkingDTO;
    }

    @Override
    public Parking toParking(ParkingDTO parkingDTO) {
        if ( parkingDTO == null ) {
            return null;
        }

        Parking parking = new Parking();

        parking.setId( parkingDTO.getId() );
        parking.setVersion( parkingDTO.getVersion() );
        parking.setCreatedDate( parkingDTO.getCreatedDate() );
        parking.setCreatedBy( parkingDTO.getCreatedBy() );
        parking.setLastModifiedDate( parkingDTO.getLastModifiedDate() );
        parking.setLastModifiedBy( parkingDTO.getLastModifiedBy() );
        parking.setNameOfParking( parkingDTO.getNameOfParking() );

        return parking;
    }

    @Override
    public List<Parking> toParkingList(List<ParkingDTO> parkingDTOList) {
        if ( parkingDTOList == null ) {
            return null;
        }

        List<Parking> list = new ArrayList<Parking>( parkingDTOList.size() );
        for ( ParkingDTO parkingDTO : parkingDTOList ) {
            list.add( toParking( parkingDTO ) );
        }

        return list;
    }

    @Override
    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        if ( parkingList == null ) {
            return null;
        }

        List<ParkingDTO> list = new ArrayList<ParkingDTO>( parkingList.size() );
        for ( Parking parking : parkingList ) {
            list.add( toParkingDTO( parking ) );
        }

        return list;
    }
}
