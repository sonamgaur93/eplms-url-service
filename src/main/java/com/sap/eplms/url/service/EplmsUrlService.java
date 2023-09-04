package com.sap.eplms.url.service;

import static com.sap.eplms.url.constant.EplmsUrlServiceConstant.STATUS;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sap.eplms.url.entity.OutboundTripDetails;
import com.sap.eplms.url.repo.OutboundTripDetailsRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EplmsUrlService {

	@Autowired
	private OutboundTripDetailsRepo outboundTripDetailsRepo;

	@Autowired
	private RestTemplate restTemplate;


	@Scheduled(cron = "0 * * * * ?") // This cron expression runs the method every minute
	public void sendNotification() {
		log.info(Thread.currentThread().getName() +"::" + "Enter Time :: " + Calendar.getInstance().getTime());
		
		List<OutboundTripDetails> outboundTripDetails =  findAllUrlUpdatedRecords();
		outboundTripDetails.stream().forEach(this::sendNotificationForOutboundTripDetails);
		
		log.info(Thread.currentThread().getName() +"::" + "Exit Time :: " + Calendar.getInstance().getTime());
	}

	private List<OutboundTripDetails> findAllUrlUpdatedRecords() {
		return outboundTripDetailsRepo.findByUrlToSendIsNotNullAndStatus(STATUS);
	}
	
	@Async
	private void sendNotificationForOutboundTripDetails(OutboundTripDetails outboundTripDetails) {
		sendHttpRequest(outboundTripDetails);
		
	}

	
	private String sendHttpRequest(OutboundTripDetails outboundTripDetails) {
	
		String url = outboundTripDetails.getUrlToSend();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> requestEntity = new HttpEntity<>(headers); 

		ResponseEntity<String> responseEntity = restTemplate.exchange(
				url,
				HttpMethod.GET,
				requestEntity,
				String.class
				);

		int statusCode = responseEntity.getStatusCodeValue();
		HttpHeaders responseHeaders = responseEntity.getHeaders();
		String responseBody = responseEntity.getBody();
		log.info(Thread.currentThread().getName() +"::" + " Time :: " + Calendar.getInstance().getTime() + " responseBody :: " +responseBody );
		return responseBody;
	}

}
