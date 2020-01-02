package com.mindtree.kalingapolicycalculator.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingapolicycalculator.dto.CustomerDto;
import com.mindtree.kalingapolicycalculator.dto.TransactionDto;
import com.mindtree.kalingapolicycalculator.entity.Customer;
import com.mindtree.kalingapolicycalculator.entity.Policy;
import com.mindtree.kalingapolicycalculator.exception.serviceexception.CustomerNotFound;
import com.mindtree.kalingapolicycalculator.exception.serviceexception.PolicyNotFoundException;
import com.mindtree.kalingapolicycalculator.exception.serviceexception.ServiceException;
import com.mindtree.kalingapolicycalculator.repository.CustomerRepository;
import com.mindtree.kalingapolicycalculator.repository.PolicyRepository;
import com.mindtree.kalingapolicycalculator.repository.TransactionRepository;
import com.mindtree.kalingapolicycalculator.service.KalingaPolicyCalculatorService;

@Service
public class KalingaPolicyCalculatorServiceImpl implements KalingaPolicyCalculatorService {

	@Autowired
	private CustomerRepository customerRepositoryObj;

	@Autowired
	private TransactionRepository transactionRepositoryObj;

	@Autowired
	private PolicyRepository policyRepositoryObj;

	ModelMapper model = new ModelMapper();

	@Override
	public String addCustomer(CustomerDto customerDto, int policyId) throws ServiceException {

		Customer customer = model.map(customerDto, Customer.class);

		Policy policy = policyRepositoryObj.findById(policyId)
				.orElseThrow(() -> new PolicyNotFoundException("Policy Not Found"));
		
		customer.getTransactions().forEach(i -> i.setPolicy(policy));

		customerRepositoryObj.save(customer);

		return "success";

	}

	@Override
	public List<TransactionDto> displayTransation(int customerId) throws ServiceException {
		Customer customer=customerRepositoryObj.findById(customerId).orElseThrow(() -> new CustomerNotFound("customer not found"));
		
		customer.getTransactions().forEach(i ->i.getStartingDate());
		
		
		return null;
	}

}
