package com.between.test.ports.input.rest.controller;

import com.between.test.ports.input.rest.request.PriceFilterRQ;
import com.between.test.ports.input.rest.response.PriceRS;
import io.swagger.annotations.ApiOperation;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 14/05/21
 **/
public interface IPriceController {

    @ApiOperation("Obtain a price")
    PriceRS getPrices(PriceFilterRQ request);

}
