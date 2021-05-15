package com.between.test.core.mapper;

import com.between.test.core.dto.PriceDTO;
import com.between.test.ports.output.dao.jpa.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPriceServiceMapper extends IMapperGeneric<Price, PriceDTO> {

}
