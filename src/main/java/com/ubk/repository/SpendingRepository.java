package com.ubk.repository;

import com.ubk.domain.Spending;
import org.springframework.repository.CrudRepository;

/**
 * Created by isc-muk on 6/1/17.
 */
public interface SpendingRepository extends CrudRepository<Spending, Long> {

    Spending findFirstByOrderByPayedAt(){

    }
}
