package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.src.model.TdsMaster;
import com.src.service.IncomeTaxService;
import com.src.utility.IDNotFoundException;


@RestController    //Used to use REST API like POSTMAN to convert into JSON 
public class MyController {

	// with the help of object it calls the method
	@Autowired
	//creating object for IncomeTaxService
	IncomeTaxService incomeService;
	
	@GetMapping("/getById")    //method for fetching the data 
	public TdsMaster getByid(@RequestBody int id) throws IDNotFoundException {
		// creating t as reference for TDSMaster to store id which are in table
		TdsMaster t = incomeService.getById(id);
		//If id not found in table
		if(t==null) {
			throw new IDNotFoundException("ID not found Wrong ID:  "+id);
		}
		else
			return t;
		
	}

	
	
}
