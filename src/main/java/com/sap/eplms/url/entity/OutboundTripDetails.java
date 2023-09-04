package com.sap.eplms.url.entity;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Outbound_TripDetails")
public class OutboundTripDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String createdDate;

    @Column(name = "matnr_code")
    private String matnrCode;

    @Column(name = "s_order_no")
    private String sorderNo;

    @Column(name = "s_order_item")
    private String sorderItem;

    @Column(name = "t_order_no")
    private String torderNo;

    @Column(name = "zlrno")
    private String zlrno;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "driver_number")
    private String driverNumber;

    @Column(name = "truck_type")
    private String truckType;

    @Column(name = "ROYALTY_SLIPNO")
    private String royaltySlipNo;

    @Column(name = "EXINVNO")
    private String exInvNo;

    @Column(name = "EXINDATE")
    private String exInDate;

    @Column(name = "ROAD_PERMIT")
    private String roadPermit;

    @Column(name = "VCAP")
    private String vcap;

    @Column(name = "WBOPNAME")
    private String wbopName;

    @Column(name = "ZSUPGWT")
    private String zsupgwt;

    @Column(name = "ZSUPTWT")
    private String zsuptwt;

    @Column(name = "MISC1")
    private String misc1;

    @Column(name = "ZSUPNWT")
    private String zsupnwt;

    @Column(name = "UNLOADER_NAME")
    private String unloaderName;

    @Column(name = "ZTVCODE")
    private String ztvCode;

    @Column(name = "ROYALTY_SLIPNO1")
    private String royaltySlipNo1;

    @Column(name = "OUTFLAG")
    private String outFlag;

    @Column(name = "ZSEAL_NO")
    private String zsealNo;

    @Column(name = "ZUNIT_NO")
    private String zunitNo;

    @Column(name = "ZUNPOINT")
    private String zunpoint;

    @Column(name = "ZLOADPOINT")
    private String zloadpoint;

    @Column(name = "company_code")
    private BigDecimal companyCode;

    @Column(name = "truck_number")
    private String truckNumber;

    @Column(name = "movement_type")
    private String movementType;

    @Column(name = "urlto_send")
    private String urlToSend;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    
    @Column(name = "status")
    private String status;

}
