package com.example.genericTable.controller;

import com.example.genericTable.entity.View;
import com.example.genericTable.repo.ViewRepo;
import com.example.genericTable.service.QueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping

public class Controller {

    private final QueryService queryService;

    @GetMapping("/find")
    public List<View> findViewByCode(@RequestParam String code)  {
        return queryService.findByCode(code);
    }

}
