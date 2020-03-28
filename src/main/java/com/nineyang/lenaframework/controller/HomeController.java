package com.nineyang.lenaframework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController extends BaseController {


    @GetMapping("")
    public String index() {
        return "hello,lena-framework";
    }

}
