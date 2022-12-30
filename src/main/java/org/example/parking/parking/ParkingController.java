package org.example.parking.parking;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/parking")
public class ParkingController {

    private final IParkingService service;
    private final ParkingMapper mapper;

    @PostMapping(value = "/v1")
    public ResponseEntity<Void> add(@RequestBody ParkingDTO parkingDTO){
        Parking parking = mapper.toParking(parkingDTO);
        service.addParking(parking);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "/v1")
    public ResponseEntity<List<ParkingDTO>> getAll(){
        List<Parking> parkingList = service.getAll();
        List<ParkingDTO> parkingDTOList = mapper.toParkingDTOList(parkingList);
        return ResponseEntity.ok(parkingDTOList);
    }

    @DeleteMapping(value = "/v1/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(value = "/v1/{id}")
    public ResponseEntity<ParkingDTO> getById(@PathVariable Long id){
        Parking parking = service.getById(id);
        ParkingDTO parkingDTO = mapper.toParkingDTO(parking);
        return ResponseEntity.ok(parkingDTO);
    }
}
