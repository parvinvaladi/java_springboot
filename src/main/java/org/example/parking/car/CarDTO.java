package org.example.parking.car;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.parking.common.BaseDTO;
import org.example.parking.parking.ParkingDTO;

@Data
public class CarDTO extends BaseDTO {

    @ApiModelProperty(required = false,hidden = true)
    private String firstName;

    @ApiModelProperty(required = false,hidden = true)
    private String lastName;

    @ApiModelProperty(required = true,hidden = false)
    private String number; //شماره پلاک

    @ApiModelProperty(required = true,hidden = false)
    private ParkingDTO parking;

    @ApiModelProperty(required = false,hidden = true)
    private String model; // مدل ماشین

    @ApiModelProperty(required = false,hidden = true)
    private String color;

    @ApiModelProperty(required = true,hidden = false)
    private Long entryTime; // date of entry
}
