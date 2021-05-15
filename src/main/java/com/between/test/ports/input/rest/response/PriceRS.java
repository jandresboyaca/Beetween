package com.between.test.ports.input.rest.response;

import com.between.test.commons.enums.CurrencyEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 14/05/21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRS {

    @ApiModelProperty("Start date of the price")
    private LocalDateTime startDate;

    @ApiModelProperty("End date of the price")
    private LocalDateTime endDate;

    @ApiModelProperty("Brand")
    private BrandRS brand;

    @ApiModelProperty("Price list")
    private int priceList;

    @ApiModelProperty("Product")
    private ProductRS product;

    @ApiModelProperty("Price to apply")
    private double price;

    @ApiModelProperty("Currency to applu")
    private CurrencyEnum currency;

}
