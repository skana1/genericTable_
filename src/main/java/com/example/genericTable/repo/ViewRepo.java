package com.example.genericTable.repo;

import com.example.genericTable.entity.View;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ViewRepo extends JpaRepository<View, Long> {

    List<View> findViewByCode(String code);
}
