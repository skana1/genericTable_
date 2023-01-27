package com.example.genericTable.service;

import com.example.genericTable.entity.Attribute;
import com.example.genericTable.entity.Conditions;
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

    public String findByCode(String code) throws EntityNotFoundException {
        List<View> view = viewRepo.findViewByCode(code);
        if (view.size() == 0) {
            log.error("View not found in DB");
            throw new EntityNotFoundException("View not found!");
        }

        Long view_id = view.get(0).getId();
        List<Attribute> attributes = attributeRepo.findByViewId(view_id);
        List<Conditions> conditions = conditionsRepo.findByViewId(view_id);

        System.out.println(attributes);
        System.out.println(conditions);

        String query = "SELECT ";

        for (int i = 0; i < attributes.size(); i++) {
            //if is the last element we do not append a comma ","
            String attributeName = attributes.get(i).getName();
            if (i + 1 == attributes.size()) {
                query += attributeName;
            } else {
                query += attributeName + ", ";
            }
        }

        query += " FROM " + view.get(0).getView_name() + " WHERE ";

        for (int i = 0; i < conditions.size(); i++) {
            Conditions currentConditions = conditions.get(i);
            if (i + 1 == conditions.size()) {
                query += currentConditions.getAttribute_name() + " = "  + "'" + currentConditions.getValue_() + "';";
            } else {
                query += currentConditions.getAttribute_name() + " = " +  "'" + currentConditions.getValue_() + "', ";
            }
        }

        return query;
    }
}
