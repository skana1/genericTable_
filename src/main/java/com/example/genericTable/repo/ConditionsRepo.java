package com.example.genericTable.repo;

import com.example.genericTable.entity.Conditions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConditionsRepo extends JpaRepository<Conditions, Long> {
}
