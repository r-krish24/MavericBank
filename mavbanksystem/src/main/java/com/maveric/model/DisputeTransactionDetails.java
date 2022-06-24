package com.maveric.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "dispute_transaction_details")
public class DisputeTransactionDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	
	private int disputeId;
	
	Date transactionDate;
	private String merchantAtmName;
	private double transactionAmount;
	private double disputeAmount;
	private String transactionIntimationDetails;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getDisputeId() {
		return disputeId;
	}
	public void setDisputeId(int disputeId) {
		this.disputeId = disputeId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getMerchantAtmName() {
		return merchantAtmName;
	}
	public void setMerchantAtmName(String merchantAtmName) {
		this.merchantAtmName = merchantAtmName;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public double getDisputeAmount() {
		return disputeAmount;
	}
	public void setDisputeAmount(int disputeAmount) {
		this.disputeAmount = disputeAmount;
	}
	public String getTransactionIntimationDetails() {
		return transactionIntimationDetails;
	}
	public void setTransactionIntimationDetails(String transactionIntimationDetails) {
		this.transactionIntimationDetails = transactionIntimationDetails;
	}
	
	@Override
	public String toString() {
	return "dispute_transaction_details [transactionId=" + transactionId + ", disputeId=" + disputeId
	+ ", transactionDate=" + transactionDate + ", merchantAtmName=" + merchantAtmName
	+ ", transactionAmount=" + transactionAmount + ", disputeAmount=" + disputeAmount
	+ ", transactionIntimationDetails=" + transactionIntimationDetails + "]";
	}
}
