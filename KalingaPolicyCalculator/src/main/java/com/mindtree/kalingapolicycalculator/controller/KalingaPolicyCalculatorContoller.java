package com.mindtree.kalingapolicycalculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kalingapolicycalculator.dto.CustomerDto;
import com.mindtree.kalingapolicycalculator.dto.TransactionDto;
import com.mindtree.kalingapolicycalculator.entity.Transaction;
import com.mindtree.kalingapolicycalculator.exception.serviceexception.ServiceException;
import com.mindtree.kalingapolicycalculator.service.KalingaPolicyCalculatorService;

@RestController
public class KalingaPolicyCalculatorContoller {

	@Autowired private KalingaPolicyCalculatorService serviceObj;
	@RequestMapping("/addCustomer/{policyId}")
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto customerDto,@PathVariable int policyId) throws ServiceException
	{
		
		String message= serviceObj.addCustomer(customerDto,policyId);
		return new ResponseEntity<String>(message,HttpStatus.OK) ;
		
	}
	
	@RequestMapping("/displayTransation/{customerId}")
	public ResponseEntity<List<TransactionDto>> displayTransation(@PathVariable int customerId) throws ServiceException
	{
		
		List<TransactionDto> transactionDtos = serviceObj.displayTransation(customerId);
		return new ResponseEntity<List<TransactionDto>>(transactionDtos,HttpStatus.OK) ;
		
	}
}
