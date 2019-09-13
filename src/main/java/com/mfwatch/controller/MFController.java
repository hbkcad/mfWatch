package com.mfwatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfwatch.model.MFModel;
import com.mfwatch.service.IMFService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api/mf/v1")
public class MFController {

	@Autowired
	IMFService iMFService;
	
	@GetMapping(value = "/all")
	@CrossOrigin(origins = "*")
	@ApiOperation(value = "Returns list of all funds", response = MFModel.class, responseContainer = "List")
	public ResponseEntity<Object> allFunds() {

		return new ResponseEntity<>(iMFService.getAllFunds(), HttpStatus.OK);
	}
	
	@PostMapping(value="/name")
	@CrossOrigin(origins="*")
	@ApiOperation(value = "Returns matching funds", response = MFModel.class,responseContainer = "List")
	public ResponseEntity<Object> byName(@RequestBody String inpData){
		
		return new ResponseEntity<>(iMFService.getFundsByName(inpData), HttpStatus.OK);
		
}}
