package com.between.test.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceFilterDTO {

    private LocalDateTime date;

    private Integer productId;

    private Integer brandId;

}
