package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by thanhnt on 12/05/2018.
 */

@Controller
public class HomeController {

    @GetMapping(value =  "/")
    public String index() {
        return "index";
    }

}
