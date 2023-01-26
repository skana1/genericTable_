package com.example.genericTable.repo;

import com.example.genericTable.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttributeRepo extends JpaRepository<Attribute, Long> {
    List<Attribute> findByViewId(Long viewId);
}
