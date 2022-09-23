package com.alexmain.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class testController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get(){
        return "Hola Mundo";
        
    }

}
