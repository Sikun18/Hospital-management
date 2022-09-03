package com.mindtree.vehicle.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehicle.entity.Vehicle;


@Service
public class VehicleService {
	@Autowired
	private Vehicle employeeDao;
	
	public List<Vehicle>getEmployeeDetails(){
		List<Vehicle>employeeData=vehicle.getEmployeeData();
		return employeeData;
	}

}
