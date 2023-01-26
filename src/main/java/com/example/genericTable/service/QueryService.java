package com.example.genericTable.service;

import com.example.genericTable.entity.View;
import com.example.genericTable.repo.AttributeRepo;
import com.example.genericTable.repo.ConditionsRepo;
import com.example.genericTable.repo.ViewRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Transactional
@Slf4j


public class QueryService {


    private final AttributeRepo attributeRepo;
    private final ConditionsRepo conditionsRepo;
    private final ViewRepo viewRepo;

    public List<View> findByCode(String code)  throws EntityNotFoundException{
        List<View> viewByCode =  viewRepo.findViewByCode(code);
        if(viewByCode.size() == 0){
            log.error("View not found in DB");
            throw new EntityNotFoundException("View not found!");
        }else {
            log.info("View found in DB: {}", code);
        }
        return viewByCode;
    }
}
