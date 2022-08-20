package org.example.finalProject.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ParkingDTO {
    @ApiModelProperty(required = false,hidden = true)
    private Long id;

    @ApiModelProperty(required = true)
    private String name;

    @ApiModelProperty(required = true)
    private Integer pricePerHour;
}
