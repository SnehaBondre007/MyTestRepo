package com.ComplaintSystem.model;

import java.util.Date;

public class Complaint {

	private String complaintId;
	private String dateReceived;
	private String product;
	private String subProduct;
	private String issue;
	private String subIssue;
	private String company;
	private String state;
	private String zipCode;
	private String submittedVia;
	private String dateClosed;
	private String companyResponseToConsumer;
	private String timelyResponse;
	private String consumerDisputed;
	
	
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSubProduct() {
		return subProduct;
	}
	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getSubmittedVia() {
		return submittedVia;
	}
	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}
	public String getCompanyResponseToConsumer() {
		return companyResponseToConsumer;
	}
	public void setCompanyResponseToConsumer(String companyResponseToConsumer) {
		this.companyResponseToConsumer = companyResponseToConsumer;
	}
	public String getTimelyResponse() {
		return timelyResponse;
	}
	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}
	public String getConsumerDisputed() {
		return consumerDisputed;
	}
	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}
	
	
	public Complaint(String complaintId, String dateReceived, String product, String subProduct, String issue,
			String subIssue, String company, String state, String zipCode, String submittedVia, String dateClosed,
			String companyResponseToConsumer, String timelyResponse, String consumerDisputed) {
		this.complaintId = complaintId;
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateClosed = dateClosed;
		this.companyResponseToConsumer = companyResponseToConsumer;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public String getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(String dateClosed) {
		this.dateClosed = dateClosed;
	}
	public Complaint() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}