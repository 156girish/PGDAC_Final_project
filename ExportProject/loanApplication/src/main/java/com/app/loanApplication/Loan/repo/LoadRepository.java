package com.app.loanApplication.Loan.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.app.loanApplication.Loan.pojo.LoanDetails;
import com.app.loanApplication.customer.pojo.CustomerDao;

public interface LoadRepository extends CrudRepository<LoanDetails, Long> {

	public Optional<List<LoanDetails>> findByCustomer(CustomerDao customer); 
}
