package com.ubk.controller;

import com.ubk.service.SpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by isc-muk on 5/31/17.
 */
@RestController
public class HomeController {

    private SpendingService spendingService;

    @Autowired
    public HomeController(SpendingService spendingService) {
        this.spendingService = spendingService;
    }

    @Value("${app.name}")
    private String appName;

    @Value("${app.desc}")
    private String appDesc;

    @RequestMapping("/")
    public String home(){
        return appDesc;
    }

    @RequestMapping("/service")
    public String callService(){
        return spendingService.getLatestSpending().toString();
    }


}
