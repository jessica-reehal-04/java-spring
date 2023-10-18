package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Insurance 
{
	private int empId;
	private InsuranceType insuranceType;
	private int coverageAmount;
}
