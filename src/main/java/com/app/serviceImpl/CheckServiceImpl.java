package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Checklist;
import com.app.repository.ChecklistRepository;
import com.app.service.CheckService;

@Service
public class CheckServiceImpl implements CheckService {
	
	@Autowired
	ChecklistRepository checkRepo;
	
	@Override
	public Checklist addNewChecklist(Checklist check) {
		return checkRepo.save(check);
	}

	@Override
	public Checklist updateChecklist(Checklist check) {
		return checkRepo.save(check);
	}

	@Override
	public Checklist getCheckListById(int checkId) {
		return checkRepo.getOne(checkId);
	}

	@Override
	public void deleteChecklistById(int checkId) {
		checkRepo.deleteById(checkId);
	}

}
