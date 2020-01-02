package com.mindtree.kalingapolicycalculator.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.kalingapolicycalculator.dto.CustomerDto;
import com.mindtree.kalingapolicycalculator.dto.TransactionDto;
import com.mindtree.kalingapolicycalculator.entity.Transaction;
import com.mindtree.kalingapolicycalculator.exception.serviceexception.ServiceException;

@Service
public interface KalingaPolicyCalculatorService {

	/**
	 * @param customerDto
	 * @param policyId
	 * @return
	 * @throws ServiceException 
	 */
	String addCustomer(CustomerDto customerDto, int policyId) throws ServiceException;

	List<TransactionDto> displayTransation(int customerId) throws ServiceException;

}
