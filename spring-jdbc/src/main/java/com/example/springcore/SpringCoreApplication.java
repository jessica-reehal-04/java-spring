package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.model.Employee;
import com.model.Insurance;
import com.model.InsuranceType;
import com.service.EmployeeInsService;


@SpringBootApplication
@ComponentScan("com")
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringCoreApplication.class, args);
		
		EmployeeInsService service=(EmployeeInsService) ctx.getBean("empins");
		
		service.addInsurance(new Employee(1162,"Jessica","Ludhiana"), new Insurance(1162,InsuranceType.HEALTH_INSURANCE,500000));
		
		System.out.println("Added successfully...");
	}

}
