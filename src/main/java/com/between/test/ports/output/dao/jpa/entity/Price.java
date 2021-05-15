package com.between.test.ports.output.dao.jpa.entity;

import com.between.test.commons.enums.CurrencyEnum;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 14/05/21
 **/
@Data
@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "start_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime startDate;

    @Column(name = "end_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private int priceList;

    private int priority;

    private double price;

    @Enumerated(EnumType.STRING)
    private CurrencyEnum currency;

}
