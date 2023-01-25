package com.example.genericTable.service;

import com.example.genericTable.repo.AttributeRepo;
import com.example.genericTable.repo.ConditionsRepo;
import com.example.genericTable.repo.ViewRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import javax.transaction.Transactional;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Transactional
@Slf4j


public class QueryService {


    private final AttributeRepo attributeRepo;
    private final ConditionsRepo conditionsRepo;
    private final ViewRepo viewRepo;



}
