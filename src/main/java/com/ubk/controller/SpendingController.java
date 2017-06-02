package com.ubk.controller;

import com.ubk.service.SpendingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by isc-muk on 6/1/17.
 */
@Controller
@RequestMapping("/spendings")
public class SpendingController {

    private static final Logger logger = LoggerFactory.getLogger(SpendingController.class);

    private SpendingService spendingService;

    @Autowired
    public SpendingController(SpendingService spendingService) {
        this.spendingService = spendingService;
    }

    @RequestMapping("/list")
    public String listSpendings(Model model){
        model.addAttribute("spendings", spendingService.list());
        return "spending/list";
    }

    @RequestMapping("/view/{id}")
    public String view(@PathVariable(value="id") Long id, Model model){
        model.addAttribute("spending", spendingService.getById(id));
        return "post/view";
    }

}
