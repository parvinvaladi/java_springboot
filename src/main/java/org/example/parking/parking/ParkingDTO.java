package org.example.parking.parking;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.parking.car.CarDTO;
import org.example.parking.common.BaseDTO;

import java.util.List;

@Data
public class ParkingDTO extends BaseDTO {

    @ApiModelProperty(required = true, hidden = false)
    private String nameOfParking;

    @ApiModelProperty(required = false,hidden = true)
    private List<CarDTO> carDTOList;
}
