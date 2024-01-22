package com.example.rentmanagment.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentmanagment.model.RentManagment;
import com.example.rentmanagment.service.RentManagmentService;

@RestController
@RequestMapping("/v1")
public class RentManagmentController {
	
	@Autowired
	private RentManagmentService rentManagmentService;
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>(new String("success"), HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<RentManagment>> getAllDetails(){
		List<RentManagment> list= this.rentManagmentService.getAllDetails();
		return new ResponseEntity<List<RentManagment>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveDetails(@RequestBody RentManagment rentManagment){
		this.rentManagmentService.saveDetails(rentManagment);
		return new ResponseEntity<String>("Saved", HttpStatus.OK);
	}
	
	
	// http://localhost:9000/v1/getSort?rentPaid=true&orderBy=name
	@GetMapping("/getSort")
	public ResponseEntity<List<RentManagment>> getSorted(@RequestParam(name="rentPaid") Boolean payload, @RequestParam(name="orderBy", required=false)String orderby){
		List<RentManagment> list= this.rentManagmentService.getSorted(payload, orderby);
		return new ResponseEntity<List<RentManagment>>(list, HttpStatus.OK);
	}
}
