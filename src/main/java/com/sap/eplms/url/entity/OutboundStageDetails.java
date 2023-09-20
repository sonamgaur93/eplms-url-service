package com.sap.eplms.url.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Outbound_StageDetails")
public class OutboundStageDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "plant_code")
    private String plantCode;

    @Column(name = "parking_number")
    private String parkingNumber;

    @Column(name = "trip_id")
    private String tripId;

    @Column(name = "stage_code")
    private String stageCode;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "sending_date")
    private LocalDate sendingDate;

    @Column(name = "service")
    private String service;

    @Column(name = "weight")
    private double weight;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "truck_number")
    private String truckNumber;

    @Column(name = "movement_type")
    private String movementType;

    @Column(name = "status", columnDefinition = "varchar(1) default 'A'")
    private String status;

    @Column(name = "no_of_attempts", columnDefinition = "int default 3")
    private int noOfAttempts;

    @Column(name = "urlto_send")
    private String urlToSend;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
