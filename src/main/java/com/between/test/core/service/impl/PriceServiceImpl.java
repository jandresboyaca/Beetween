package com.between.test.core.service.impl;

import com.between.test.commons.exception.NotFoundException;
import com.between.test.core.dto.PriceDTO;
import com.between.test.core.dto.PriceFilterDTO;
import com.between.test.core.mapper.IPriceServiceMapper;
import com.between.test.core.service.IPriceService;
import com.between.test.ports.output.dao.jpa.entity.Price;
import com.between.test.ports.output.dao.jpa.repo.IPriceRepository;
import io.vavr.collection.Seq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@Service
@AllArgsConstructor
public class PriceServiceImpl implements IPriceService {

    private final IPriceRepository priceRepository;

    private final IPriceServiceMapper priceMapper;

    @Override
    public PriceDTO getValidPrice(PriceFilterDTO priceFilterDTO) {

        Seq<Price> seqPrice = priceRepository.findPrice(priceFilterDTO.getBrandId(), priceFilterDTO.getProductId(), priceFilterDTO.getDate());

        Price price = seqPrice.getOrElseThrow(NotFoundException::new);

        return priceMapper.entityToDTO(price);

    }
}
