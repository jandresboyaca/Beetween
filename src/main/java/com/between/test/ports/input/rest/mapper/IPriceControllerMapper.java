package com.between.test.ports.input.rest.mapper;

import com.between.test.core.dto.PriceDTO;
import com.between.test.core.dto.PriceFilterDTO;
import com.between.test.ports.input.rest.request.PriceFilterRQ;
import com.between.test.ports.input.rest.response.PriceRS;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPriceControllerMapper extends IMapperGeneric<PriceFilterRQ, PriceFilterDTO> {

    PriceRS priceDTOToPriceRS(PriceDTO priceDTO);
}
