package com.between.test.core.dto;

import com.between.test.commons.enums.CurrencyEnum;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 14/05/21
 **/
@Data
public class PriceDTO {

    private int id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private BrandDTO brand;

    private int priceList;

    private ProductDTO product;

    private int priority;

    private double price;

    private CurrencyEnum currency;

}
