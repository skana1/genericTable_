package com.example.genericTable.controller;

import com.example.genericTable.service.QueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping

public class Controller {

    private final QueryService queryService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public
}
