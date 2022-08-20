package org.example.finalProject.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CarDTO {
    @ApiModelProperty(required = false,hidden = true)
    private Long id;

    @ApiModelProperty(required = true)
    private String ownerName;

    @ApiModelProperty(required = true)
    private String brand;

    @ApiModelProperty(required = true)
    private String color;

    @ApiModelProperty(required = true)
    private Integer hourOfEntry;

    @ApiModelProperty(required = true)
    private Integer minuteOfEntry;

    @ApiModelProperty(required = true)
    private Integer hourOfExit;

    @ApiModelProperty(required = true)
    private Integer minuteOfExit;

}
