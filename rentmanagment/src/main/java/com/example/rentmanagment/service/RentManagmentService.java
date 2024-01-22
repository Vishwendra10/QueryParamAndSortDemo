package com.example.rentmanagment.service;

import java.util.List;

import com.example.rentmanagment.model.RentManagment;

public interface RentManagmentService {

	List<RentManagment> getAllDetails();

	void saveDetails(RentManagment rentManagment);

	List<RentManagment> getSorted(Boolean payload, String orderby);

}
