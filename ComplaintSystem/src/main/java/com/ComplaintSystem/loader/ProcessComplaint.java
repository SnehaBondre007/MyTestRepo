package com.ComplaintSystem.loader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ComplaintSystem.model.Complaint;

public class ProcessComplaint {
	
	public void process(String line) {
		 Complaint complaint = new Complaint();
		 List<Complaint> complaintList = new ArrayList<Complaint>();
		
		 complaintList.add(complaint);
		
		/*
		int nextID=0;;
		int id = nextID;
	    nextID++;
	    String[] parts = line.split(":");
	    String complaintId = parts[0];
	    String dateReceived = parts[1];
	    String subProduct = parts[2];
	    String issue = parts[3];
	    String subIssue = parts[4];
	    String company = parts[5];     
	    String state = parts[6];
	    String zipCode = parts[7];
	    String submittedVia = parts[8];
	    String dateClosed = parts[9];
	    String companyResponseToConsumer = parts[10]; 
	    String timelyResponse = parts[11];
	    String consumerDisputed = parts[12];
	
	    List<Complaint> complaint= new ArrayList<Complaint>();
	    complaint.add(new Complaint(id, parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7], parts[8], parts[9], parts[10], parts));
	*/
	}
	
}
