package com.between.test.ports.output.dao.jpa.repo;

import com.between.test.ports.output.dao.jpa.entity.Price;
import io.vavr.collection.Seq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 14/05/21
 **/
@Repository
public interface IPriceRepository extends JpaRepository<Price, Integer> {

    /**
     * @deprecated just to put this note
     * Hardest to read useful in short query
     */
    @Deprecated
    Optional<Price> findByBrandIdAndProductIdAndAndStartDateLessThanAndEndDateGreaterThan(Integer brandId, Integer productId, Date startDate, Date endDate);

    @Query("SELECT p FROM Price p WHERE " +
            "p.brand.id = :brandId AND " +
            "p.product.id = :productId AND " +
            "p.startDate <= :date AND " +
            "p.endDate >= : date ORDER BY p.priority DESC")
    Seq<Price> findPrice(int brandId, int productId, LocalDateTime date);


}
