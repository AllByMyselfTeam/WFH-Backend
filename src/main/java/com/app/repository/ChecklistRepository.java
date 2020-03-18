package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Checklist;

public interface ChecklistRepository extends JpaRepository<Checklist, Integer> {

}
