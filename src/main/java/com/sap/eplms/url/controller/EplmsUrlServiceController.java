package com.sap.eplms.url.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.eplms.url.entity.OutboundConsignmentDetails;
import com.sap.eplms.url.entity.OutboundStageDetails;
import com.sap.eplms.url.entity.OutboundTripDetails;
import com.sap.eplms.url.entity.OutboundVehicleMaster;

@RestController
@RequestMapping("/api")
public class EplmsUrlServiceController {


	@PostMapping("/sendDataToSap")
	public ResponseEntity<String> sendDataToSap(@RequestBody OutboundConsignmentDetails outboundConsignmentDetails) {
		System.out.println("outboundConsignmentDetails Data.................:" + outboundConsignmentDetails.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body("Data send succesfully");
	}

	@PostMapping("/sendOutboundStageDataToSap")
	public ResponseEntity<String> sendOutboundStageDataToSap(@RequestBody OutboundStageDetails outboundStageDetails) {
		System.out.println("outboundStageDetails Data.................:" + outboundStageDetails.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body("Data send succesfully");
	}

	@PostMapping("/sendOutboundTripDataToSap")
	public ResponseEntity<String> sendOutboundTripDataToSap(@RequestBody OutboundTripDetails outboundTripDetails) {
		System.out.println("outboundTripDetails Data.................:" + outboundTripDetails.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body("Data send succesfully");
	}

	@PostMapping("/sendVehicleMasterDataToSap")
	public ResponseEntity<String> sendOutboundVehicleDataToSap(
			@RequestBody OutboundVehicleMaster outboundVehicleMaster) {
		System.out.println("outboundVehicleMaster Data.................:" + outboundVehicleMaster.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body("Data send succesfully");
	}
}