package com.between.test.core.service.impl;

import com.between.test.core.dto.PriceFilterDTO;
import com.between.test.core.mapper.IPriceServiceMapper;
import com.between.test.core.service.IPriceService;
import com.between.test.ports.output.dao.jpa.entity.Price;
import com.between.test.ports.output.dao.jpa.repo.IPriceRepository;
import io.vavr.collection.Vector;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@ExtendWith(MockitoExtension.class)
class PriceServiceImplTest {

    @Mock
    private IPriceRepository priceRepository;

    private IPriceService priceService;
    private final EasyRandom easyRandom = new EasyRandom();

    @BeforeEach
    void setup() {
        IPriceServiceMapper priceMapper = Mappers.getMapper(IPriceServiceMapper.class);
        priceService = new PriceServiceImpl(priceRepository, priceMapper);
    }

    @Test
    void givenARequest_WhenDataIsValid_ThenReturnPrice() {
        Vector<Price> price = Vector.of(easyRandom.nextObject(Price.class));
        when(priceRepository.findPrice(anyInt(), anyInt(), any())).thenReturn(price);
        priceService.getValidPrice(easyRandom.nextObject(PriceFilterDTO.class));
        verify(priceRepository).findPrice(anyInt(), anyInt(), any());
    }
}