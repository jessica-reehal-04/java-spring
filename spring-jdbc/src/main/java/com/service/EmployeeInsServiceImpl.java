package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;
import com.dao.InsuranceDAO;
import com.model.Employee;
import com.model.Insurance;

@Service("empins")
public class EmployeeInsServiceImpl implements EmployeeInsService
{
	@Autowired
	private EmployeeDAO empDao;
	
	@Autowired
	private InsuranceDAO insDao;

	@Override
	public void addInsurance(Employee employee, Insurance insurance)
	{
		empDao.addEmployee(employee);
		insDao.addInsurance(insurance);
	}

}
