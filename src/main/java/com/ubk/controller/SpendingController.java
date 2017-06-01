package com.ubk.controller;

import com.ubk.domain.Spending;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by isc-muk on 6/1/17.
 */
@Controller
@RequestMapping("/spendings")
public class SpendingController {

    private static final Logger logger = LoggerFactory.getLogger(SpendingController.class);

    @SuppressWarnings("unused")
    @RequestMapping("/get/{slug}")
    public String getSpending(@PathVariable(value="slug") String slug) throws Exception{
        Spending spending = null;
        logger.debug("getSpending called with slug: "+slug);
        if(spending ==null) throw new Exception("We couldn't find the spending with slug: " + slug);
        return "index";
    }
}
