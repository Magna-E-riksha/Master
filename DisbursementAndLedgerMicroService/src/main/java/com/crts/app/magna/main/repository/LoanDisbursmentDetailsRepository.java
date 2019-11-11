package com.crts.app.magna.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crts.app.magna.main.model.LoanDisbursmentDetails;

@Repository
public interface LoanDisbursmentDetailsRepository extends JpaRepository<LoanDisbursmentDetails, Integer> {

}
