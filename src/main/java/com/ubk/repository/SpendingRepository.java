package com.ubk.repository;

import com.ubk.domain.Spending;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by isc-muk on 6/1/17.
 */
@Repository
public interface SpendingRepository extends CrudRepository<Spending, Long> {

    Spending findFirstByOrderByPayedAtDesc();

    List<Spending> findAllByOrderByPayedAtDesc();

    Spending findById(Long id);
}
