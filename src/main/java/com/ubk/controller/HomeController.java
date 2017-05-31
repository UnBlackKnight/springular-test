package com.ubk.controller;

import com.ubk.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by isc-muk on 5/31/17.
 */
@RestController
public class HomeController {

    private NewService newService;

    @Autowired
    public HomeController(NewService newService) {
        this.newService = newService;
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
        return newService.giveSomething();
    }


}
