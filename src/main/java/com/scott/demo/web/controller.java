package com.scott.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class controller {
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createOrderByUserId(@RequestParam String str) {
        return str;
    }
}
