package com.between.test.ports.input.rest.mapper;

import java.util.List;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@SuppressWarnings("unchecked")
public interface IMapperGeneric<T, D> {

    T dtoToEntity(D dto);

    D entityToDTO(T entity);

    List<D> entityToDTO(List<T> entity);

    List<T> dtoToEntity(List<D> entity);

}

