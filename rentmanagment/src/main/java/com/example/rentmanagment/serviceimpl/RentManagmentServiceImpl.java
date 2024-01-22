package com.example.rentmanagment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.rentmanagment.model.RentManagment;
import com.example.rentmanagment.repository.RentManagmentRepository;
import com.example.rentmanagment.service.RentManagmentService;

@Service
public class RentManagmentServiceImpl implements RentManagmentService{

	@Autowired
	private RentManagmentRepository rentManagmentRepository;
	
	@Override
	public List<RentManagment> getAllDetails() {
		List<RentManagment> list= this.rentManagmentRepository.findAll();
		return list;
	}

	@Override
	public void saveDetails(RentManagment rentManagment) {
		this.rentManagmentRepository.save(rentManagment);
	}

	@Override
	public List<RentManagment> getSorted(Boolean payload, String orderBy) {
		
		Sort sort=Sort.by(orderBy).ascending();
		List<RentManagment> list= this.rentManagmentRepository.findByRentPaidqq(payload, sort);
		return list;
	}

}
