package com.between.test.ports.input.rest.controller.impl;

import com.between.test.core.dto.PriceFilterDTO;
import com.between.test.core.service.IPriceService;
import com.between.test.ports.input.rest.controller.IPriceController;
import com.between.test.ports.input.rest.mapper.IPriceControllerMapper;
import com.between.test.ports.input.rest.request.PriceFilterRQ;
import com.between.test.ports.input.rest.response.PriceRS;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 14/05/21
 **/
@RestController
@AllArgsConstructor
public class PriceControllerImpl implements IPriceController {

    private final IPriceService priceService;
    private final IPriceControllerMapper priceMapper;

    @Override
    @GetMapping("/price")
    public PriceRS getPrices(@Valid PriceFilterRQ request) {

        PriceFilterDTO priceFilterDTO = this.priceMapper.entityToDTO(request);

        return this.priceMapper.priceDTOToPriceRS(priceService.getValidPrice(priceFilterDTO));

    }
}
