package com.sap.eplms.url.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "Outbound_ConsignmentDetails")
public class OutboundConsignmentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "plant_code")
	private String plantCode;

	@Column(name = "parking_number")
	private String parkingNumber;

	@Column(name = "trip_id")
	private String tripId;

	@Column(name = "sales_order_no")
	private String salesOrderNo;

	@Column(name = "sales_lineitem_no")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate salesLineItemNo;

	@Column(name = "sending_date")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate sendingDate;

	@Column(name = "transporter_code")
	private String transporterCode;

	@Column(name = "transporter_name")
	private String transporterName;

	@Column(name = "company_code")
	private String companyCode;

	@Column(name = "truck_number")
	private String truckNumber;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "order_type")
	private String orderType;

	@Column(name = "driver_number")
	private String driverNumber;

	@Column(name = "is_multiorder")
	private Integer isMultiorder;

	@Column(name = "status", columnDefinition = "varchar(1) default 'A'")
	private String status;

	@Column(name = "no_of_attempts", columnDefinition = "int default 3")
	private Integer noOfAttempts;

	@Column(name = "driver_name")
	private String driverName;

	@Column(name = "urlto_send")
	private String urlToSend;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

}
