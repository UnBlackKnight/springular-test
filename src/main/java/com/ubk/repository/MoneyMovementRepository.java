package com.ubk.repository;

import com.ubk.domain.MoneyMovement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by isc-muk on 6/1/17.
 */
@Repository
public interface MoneyMovementRepository extends CrudRepository<MoneyMovement,Long> {

    MoneyMovement findFirstByOrderByPayedAtDesc();

    List<MoneyMovement> findAllByOrderByPayedAtDesc();

    MoneyMovement findById(Long id);
}
