package com.app.service;

import com.app.pojo.Checklist;

public interface CheckService {
	public Checklist addNewChecklist(Checklist check);
	public Checklist updateChecklist(Checklist check);
	public Checklist getCheckListById(int checkId);
	public void deleteChecklistById(int checkId);
}
