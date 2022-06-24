package com.maveric.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dispute_customer_details")
public class DisputeCustomerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int disputeId;
	
	private String customerName;
	private String cardNumber;
	private String accountNumber;
	private String emailId;
	private String mobileNumber;
	
	private Date presentDate;
	
	public DisputeCustomerDetails()
	{
		
	}
	
	public DisputeCustomerDetails(int disputeId, String customerName, String cardNumber, String accountNumber, String emailId, String mobileNumber, Date presentDate) 
	{
		super();
		this.disputeId = disputeId;
		this.customerName = customerName;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.presentDate = presentDate;
	}
	
	public  int getDisputeId() {
		return disputeId;
	}
	public void setDisputeId(int disputeId) {
		this.disputeId = disputeId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getPresentDate() {
		return presentDate;
	}
	public void setPresentDate(Date presentDate) {
		this.presentDate = presentDate;
	}
}
