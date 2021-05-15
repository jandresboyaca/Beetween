package com.between.test.core.mapper;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@SuppressWarnings("unchecked")
public interface IMapperGeneric<T, D> {

    T dtoToEntity(D dto);

    D entityToDTO(T entity);

}

