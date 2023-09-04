package com.sap.eplms.url.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.eplms.url.entity.OutboundTripDetails;

@Repository
public interface OutboundTripDetailsRepo extends JpaRepository<OutboundTripDetails, Integer> {
	
	 List<OutboundTripDetails> findByUrlToSendIsNotNullAndStatus(String status);
   
}
