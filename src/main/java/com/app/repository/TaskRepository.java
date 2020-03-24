package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Checklist;
import com.app.pojo.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {
	List<Task> findByStatus(int status);
	List<Task> findByChecklist(Checklist checklist);
}
