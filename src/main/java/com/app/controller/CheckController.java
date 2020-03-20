package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Checklist;
import com.app.service.CheckService;

@RestController
@RequestMapping("/Checklist")
@CrossOrigin(origins = "http://localhost:4200")
public class CheckController {
	@Autowired
	CheckService checkService;
	
//	@GetMapping("/{id}")
//	public Checklist getChecklistById(@PathVariable("id") int checkId) {
//		return checkService.getCheckListById(checkId);
//	}
//	
//	@PostMapping
//	public ResponseEntity<Checklist> addChecklist (@Valid @RequestBody Checklist check){
//		return new ResponseEntity<>(checkService.addNewChecklist(check),HttpStatus.CREATED);
//	}
//	@PutMapping("/{id}")
//	public Checklist updateChecklist(@Valid @RequestBody Checklist check) {
//		return checkService.updateChecklist(check);
//	}
	
}
