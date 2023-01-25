package com.example.genericTable.repo;

import com.example.genericTable.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeRepo extends JpaRepository<Attribute, Long> {
}
