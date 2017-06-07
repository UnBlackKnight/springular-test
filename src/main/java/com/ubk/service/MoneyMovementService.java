package com.ubk.service;

import com.ubk.domain.MoneyMovement;
import com.ubk.repository.MoneyMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by isc-muk on 6/1/17.
 */
@Service
public class MoneyMovementService {

    private MoneyMovementRepository moneyMovementRepository;

    @Autowired
    public MoneyMovementService(MoneyMovementRepository moneyMovementRepository) {
        this.moneyMovementRepository = moneyMovementRepository;
    }

    public MoneyMovement getLatestSpending(){
        return moneyMovementRepository.findFirstByOrderByPayedAtDesc();
    }

    public List<MoneyMovement> list(){
        return moneyMovementRepository.findAllByOrderByPayedAtDesc();
    }

    private MoneyMovement getById(Long id) {
        return moneyMovementRepository.findById(id);
    }

    public MoneyMovement create(MoneyMovement moneyMovement) {
        //TODO Exceptionhandling!
        moneyMovementRepository.save(moneyMovement);
        return null;
    }

    public MoneyMovement read(Long id) {
        //TODO Exceptionhandling!
        return this.getById(id);
    }

    public String update(Long id) {
        //TODO!
        //moneyMovementRepository.
        return null;
    }

    public void delete(Long id) {
        moneyMovementRepository.delete(id);
    }


}
