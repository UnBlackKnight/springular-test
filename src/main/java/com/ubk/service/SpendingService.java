package com.ubk.service;

import com.ubk.domain.Spending;
import com.ubk.repository.SpendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by isc-muk on 6/1/17.
 */
@Service
public class SpendingService {

    private SpendingRepository spendingRepository;

    @Autowired
    public SpendingService(SpendingRepository spendingRepository) {
        this.spendingRepository = spendingRepository;
    }

    public Spending getLatestSpending(){
        return spendingRepository.findFirstByOrderByPayedAtDesc();
    }

    public List<Spending> list(){
        return spendingRepository.findAllByOrderByPayedAtDesc();
    }

    public Spending getById(Long id) {
        return spendingRepository.findById(id);
    }
}
