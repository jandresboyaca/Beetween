package com.between.test.core.service;

import com.between.test.core.dto.PriceDTO;
import com.between.test.core.dto.PriceFilterDTO;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
public interface IPriceService {

    /**
     * Get valid prices
     *
     * @param priceFilterDTO {@link PriceFilterDTO}
     * @return {@link PriceDTO}
     */
    PriceDTO getValidPrice(PriceFilterDTO priceFilterDTO);
}
