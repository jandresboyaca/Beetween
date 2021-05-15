package com.between.test.ports.input.rest.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@Data
public class ProductRS {

    @ApiModelProperty("Name of the product")
    private String name;

}
