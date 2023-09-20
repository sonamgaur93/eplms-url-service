package com.sap.eplms.url.entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Outbound_VehicleMaster")
public class OutboundVehicleMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "model_number")
    private String modelNumber;

    @Column(name = "manufacturing_date")
    private LocalDate manufacturingDate;

    @Column(name = "description")
    private String description;

    @Column(name = "RFID_number")
    private String rfidNumber;

    @Column(name = "status", columnDefinition = "varchar(1) default 'A'")
    private String status;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "transporter")
    private LocalDate transporter;

    @Column(name = "no_of_wheels")
    private String noOfWheels;

    @Column(name = "certified_capacity")
    private String certifiedCapacity;

    @Column(name = "pollution_expiry_date")
    private LocalDate pollutionExpiryDate;

    @Column(name = "fitness_expiry_date")
    private LocalDate fitnessExpiryDate;

    @Column(name = "insurance_policy_expiry")
    private LocalDate insurancePolicyExpiry;

    @Column(name = "vehicle_capacity_min",columnDefinition = "decimal(10,3) DEFAULT NULL")
    private BigDecimal vehicleCapacityMin;

    @Column(name = "vehicle_capacity_max",columnDefinition = "decimal(10,3) DEFAULT NULL")
    private BigDecimal vehicleCapacityMax;

    @Column(name = "chassis_number")
    private String chasisNumber;

    @Column(name = "imei_number")
    private String imeiNumber;

    @Column(name = "gps_device_number")
    private String gpsDeviceNumber;

    @Column(name = "gps_activated",columnDefinition = "varchar(1) default '	D'")
    private String gpsActivated;

    @Column(name = "is_backhauling",columnDefinition = "varchar(1) default 'D'")
    private String isBackhauling;

    @Column(name = "insurance_policy_number")
    private LocalDate insurancePolicyNumber;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "plant_code")
    private String plantCode;

    @Column(name = "loading_type",columnDefinition = "varchar(1) default 'M'")
    private String loadingType;

    @Column(name = "registered_state")
    private String registeredState;

    @Column(name = "rc_number")
    private String rcNumber;

    @Column(name = "movement_type")
    private String movementType;

    @Column(name = "tax_renewal_date")
    private LocalDate taxRenewalDate;
    
    @Column(name = "tare_weight", columnDefinition = "decimal(10,3) DEFAULT NULL")
    private BigDecimal tareWeight;

    @Column(name = "gross_weight",columnDefinition = "decimal(10,3) DEFAULT NULL")
    private BigDecimal grossWeight;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "received_date", nullable = true)
    private LocalDateTime receivedDate;
    
    @Column(name = "no_of_attempts",columnDefinition = "int default 3")
    private Integer noOfAttempts;
    
    @Column(name = "urlto_send")
    private String urlToSend;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
