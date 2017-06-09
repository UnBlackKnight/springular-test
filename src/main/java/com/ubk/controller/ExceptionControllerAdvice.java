package com.ubk.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by isc-muk on 6/1/17.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String exception(Exception exception, Model model) {
        model.addAttribute("exception", exception);
        return "globalControllerHandler";
    }
}
