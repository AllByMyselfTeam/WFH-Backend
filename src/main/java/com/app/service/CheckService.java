package com.app.service;

import java.util.List;

import com.app.pojo.Checklist;

public interface CheckService {
	public Checklist addNewChecklist(Checklist check);
	public Checklist updateChecklist(Checklist check);
	public Checklist getCheckListById(int checkId);
	public void deleteChecklistById(int checkId);
	public List<Checklist> findAllById(int userid);
}
