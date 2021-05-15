package com.between.test.ports.input.rest.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceFilterRQ {

    @ApiModelProperty(value = "Date to filter", example = "2000-10-31T01:30:00.000-05:00", required = true)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @NotNull
    private LocalDateTime date;

    @ApiModelProperty(value = "Identifier of the product", example = "10", required = true)
    @NotNull
    @Min(1)
    private Integer productId;

    @ApiModelProperty(value = "Identifier of the brand", example = "10", required = true)
    @NotNull
    @Min(1)
    private Integer brandId;

}
