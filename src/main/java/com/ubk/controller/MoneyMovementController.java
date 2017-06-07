package com.ubk.controller;

import com.ubk.domain.MoneyMovement;
import com.ubk.exception.EntryNotFoundException;
import com.ubk.service.MoneyMovementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by isc-muk on 6/1/17.
 */
@RestController
@RequestMapping("/movement")
public class MoneyMovementController {

    private static final Logger logger = LoggerFactory.getLogger(MoneyMovementController.class);

    private MoneyMovementService moneyMovementService;

    @Autowired
    public MoneyMovementController(MoneyMovementService moneyMovementService) {
        this.moneyMovementService = moneyMovementService;
    }

    @RequestMapping( value = "/", method = RequestMethod.GET)
    public Iterable<MoneyMovement> list(){
        return moneyMovementService.list();
    }

    @RequestMapping( value = "/", method = RequestMethod.POST)
    public MoneyMovement create(@RequestBody MoneyMovement moneyMovement){
        return moneyMovementService.create(moneyMovement);
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.GET)
    public MoneyMovement read(@PathVariable(value="id") Long id){
        MoneyMovement moneyMovement = moneyMovementService.read(id);
        if (moneyMovement == null){
            throw new EntryNotFoundException("MoneyMovement with id: " + id + " not found.");
        }
        return moneyMovementService.read(id);
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable(value="id") Long id){
        return moneyMovementService.update(id);
    }

    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value="id") Long id){
        moneyMovementService.delete(id);
    }


}
