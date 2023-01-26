package com.example.genericTable.repo;

import com.example.genericTable.entity.Conditions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConditionsRepo extends JpaRepository<Conditions, Long> {
    List<Conditions> findByViewId(Long viewId);
}
