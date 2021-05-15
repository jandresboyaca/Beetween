package com.between.test.ports.output.dao.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 15/05/21
 **/
@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    private int id;

    private String name;

}
