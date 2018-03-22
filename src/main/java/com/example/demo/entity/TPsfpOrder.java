package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TPsfpOrder {
    private String ordBillno;

	private String ordPrdcode;

	private String ordCrcode;

	private String ordMerbillno;

	private Date ordPretime;

	private Date ordDotime;

	private Date ordMertime;

	private String ordMercodefrom;

	private Short ordTypefrom;

	private String ordMercodeto;

	private Short ordTypeto;

	private String ordAcccodefrom;

	private String ordAcccodeto;

	private BigDecimal ordAmt;

	private Short ordStatus;

	private String ordAttach;

	private Date ordUpdatetime;

	private String ordProduct;

	private BigDecimal ordRefunded;

	private BigDecimal ordRefuse;

	private String ordPreip;

	private String ordEndip;

	private Date ordBillexptime;

	private Short ordDirectly;

	private String ordSyscode;

	private String ordBrccode;

	private String ordSrccode;

	private BigDecimal ordPayedamt;

	private String trdCode;

	private String resv1;

	private String resv2;

	private String resv3;

	private String ordPrdcodeOld;

	private String trdCodeOld;
	
	private String hasDependMer;

	public String getOrdBillno() {
		return ordBillno;
	}

	public void setOrdBillno(String ordBillno) {
		this.ordBillno = ordBillno == null ? null : ordBillno.trim();
	}

	public String getOrdPrdcode() {
		return ordPrdcode;
	}

	public void setOrdPrdcode(String ordPrdcode) {
		this.ordPrdcode = ordPrdcode == null ? null : ordPrdcode.trim();
	}

	public String getOrdCrcode() {
		return ordCrcode;
	}

	public void setOrdCrcode(String ordCrcode) {
		this.ordCrcode = ordCrcode == null ? null : ordCrcode.trim();
	}

	public String getOrdMerbillno() {
		return ordMerbillno;
	}

	public void setOrdMerbillno(String ordMerbillno) {
		this.ordMerbillno = ordMerbillno == null ? null : ordMerbillno.trim();
	}

	public Date getOrdPretime() {
		return ordPretime;
	}

	public void setOrdPretime(Date ordPretime) {
		this.ordPretime = ordPretime;
	}

	public Date getOrdDotime() {
		return ordDotime;
	}

	public void setOrdDotime(Date ordDotime) {
		this.ordDotime = ordDotime;
	}

	public Date getOrdMertime() {
		return ordMertime;
	}

	public void setOrdMertime(Date ordMertime) {
		this.ordMertime = ordMertime;
	}

	public String getOrdMercodefrom() {
		return ordMercodefrom;
	}

	public void setOrdMercodefrom(String ordMercodefrom) {
		this.ordMercodefrom = ordMercodefrom == null ? null : ordMercodefrom
				.trim();
	}

	public Short getOrdTypefrom() {
		return ordTypefrom;
	}

	public void setOrdTypefrom(Short ordTypefrom) {
		this.ordTypefrom = ordTypefrom;
	}

	public String getOrdMercodeto() {
		return ordMercodeto;
	}

	public void setOrdMercodeto(String ordMercodeto) {
		this.ordMercodeto = ordMercodeto == null ? null : ordMercodeto.trim();
	}

	public Short getOrdTypeto() {
		return ordTypeto;
	}

	public void setOrdTypeto(Short ordTypeto) {
		this.ordTypeto = ordTypeto;
	}

	public String getOrdAcccodefrom() {
		return ordAcccodefrom;
	}

	public void setOrdAcccodefrom(String ordAcccodefrom) {
		this.ordAcccodefrom = ordAcccodefrom == null ? null : ordAcccodefrom
				.trim();
	}

	public String getOrdAcccodeto() {
		return ordAcccodeto;
	}

	public void setOrdAcccodeto(String ordAcccodeto) {
		this.ordAcccodeto = ordAcccodeto == null ? null : ordAcccodeto.trim();
	}

	public BigDecimal getOrdAmt() {
		return ordAmt;
	}

	public void setOrdAmt(BigDecimal ordAmt) {
		this.ordAmt = ordAmt;
	}

	public Short getOrdStatus() {
		return ordStatus;
	}

	public void setOrdStatus(Short ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getOrdAttach() {
		return ordAttach;
	}

	public void setOrdAttach(String ordAttach) {
		this.ordAttach = ordAttach == null ? null : ordAttach.trim();
	}

	public Date getOrdUpdatetime() {
		return ordUpdatetime;
	}

	public void setOrdUpdatetime(Date ordUpdatetime) {
		this.ordUpdatetime = ordUpdatetime;
	}

	public String getOrdProduct() {
		return ordProduct;
	}

	public void setOrdProduct(String ordProduct) {
		this.ordProduct = ordProduct == null ? null : ordProduct.trim();
	}

	public BigDecimal getOrdRefunded() {
		return ordRefunded;
	}

	public void setOrdRefunded(BigDecimal ordRefunded) {
		this.ordRefunded = ordRefunded;
	}

	public BigDecimal getOrdRefuse() {
		return ordRefuse;
	}

	public void setOrdRefuse(BigDecimal ordRefuse) {
		this.ordRefuse = ordRefuse;
	}

	public String getOrdPreip() {
		return ordPreip;
	}

	public void setOrdPreip(String ordPreip) {
		this.ordPreip = ordPreip == null ? null : ordPreip.trim();
	}

	public String getOrdEndip() {
		return ordEndip;
	}

	public void setOrdEndip(String ordEndip) {
		this.ordEndip = ordEndip == null ? null : ordEndip.trim();
	}

	public Date getOrdBillexptime() {
		return ordBillexptime;
	}

	public void setOrdBillexptime(Date ordBillexptime) {
		this.ordBillexptime = ordBillexptime;
	}

	public Short getOrdDirectly() {
		return ordDirectly;
	}

	public void setOrdDirectly(Short ordDirectly) {
		this.ordDirectly = ordDirectly;
	}

	public String getOrdSyscode() {
		return ordSyscode;
	}

	public void setOrdSyscode(String ordSyscode) {
		this.ordSyscode = ordSyscode == null ? null : ordSyscode.trim();
	}

	public String getOrdBrccode() {
		return ordBrccode;
	}

	public void setOrdBrccode(String ordBrccode) {
		this.ordBrccode = ordBrccode == null ? null : ordBrccode.trim();
	}

	public String getOrdSrccode() {
		return ordSrccode;
	}

	public void setOrdSrccode(String ordSrccode) {
		this.ordSrccode = ordSrccode == null ? null : ordSrccode.trim();
	}

	public BigDecimal getOrdPayedamt() {
		return ordPayedamt;
	}

	public void setOrdPayedamt(BigDecimal ordPayedamt) {
		this.ordPayedamt = ordPayedamt;
	}

	public String getTrdCode() {
		return trdCode;
	}

	public void setTrdCode(String trdCode) {
		this.trdCode = trdCode == null ? null : trdCode.trim();
	}

	public String getResv1() {
		return resv1;
	}

	public void setResv1(String resv1) {
		this.resv1 = resv1 == null ? null : resv1.trim();
	}

	public String getResv2() {
		return resv2;
	}

	public void setResv2(String resv2) {
		this.resv2 = resv2 == null ? null : resv2.trim();
	}

	public String getResv3() {
		return resv3;
	}

	public void setResv3(String resv3) {
		this.resv3 = resv3 == null ? null : resv3.trim();
	}

	public String getOrdPrdcodeOld() {
		return ordPrdcodeOld;
	}

	public void setOrdPrdcodeOld(String ordPrdcodeOld) {
		this.ordPrdcodeOld = ordPrdcodeOld == null ? null : ordPrdcodeOld
				.trim();
	}

	public String getTrdCodeOld() {
		return trdCodeOld;
	}

	public void setTrdCodeOld(String trdCodeOld) {
		this.trdCodeOld = trdCodeOld == null ? null : trdCodeOld.trim();
	}

	public String getHasDependMer() {
		return hasDependMer;
	}

	public void setHasDependMer(String hasDependMer) {
		this.hasDependMer = hasDependMer;
	}

}