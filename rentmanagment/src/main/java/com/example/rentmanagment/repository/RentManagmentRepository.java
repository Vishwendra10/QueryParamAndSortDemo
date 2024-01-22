package com.example.rentmanagment.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.rentmanagment.model.RentManagment;

@Repository
public interface RentManagmentRepository extends JpaRepository<RentManagment, Integer>{

	
	@Query("SELECT r FROM RentManagment r WHERE r.rentPaid= :payload")
	List<RentManagment> findByRentPaidqq(@Param(value = "payload") Boolean payload,Sort sort);

}
