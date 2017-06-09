package com.ubk.controller;

import com.ubk.service.MoneyMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by isc-muk on 5/31/17.
 */
@RestController
public class HomeController {

    private MoneyMovementService moneyMovementService;

    @Autowired
    public HomeController(MoneyMovementService moneyMovementService) {
        this.moneyMovementService = moneyMovementService;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("moneyMovement", moneyMovementService.getLatestSpending());
        return "index";
    }

}