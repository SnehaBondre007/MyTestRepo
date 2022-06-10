package com.ComplaintSystem.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ComplaintSystem.model.Complaint;
import com.opencsv.CSVReader;

public class ComplaintLoader {
	ArrayList<Complaint> ComplaintList = new ArrayList<Complaint>();
	ProcessComplaint processComplaint;
	CSVReader reader = null;
	public void loader(String filename) {
	try {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
        int i = 0;
        String line;
        line = reader.readLine();
        while (line != null && !line.equals("")) {
            i++;
            processComplaint.process(line);
            line = reader.readLine();
        }
        System.out.println("" + i + " books read");
    } catch (Exception e) {
        System.err.println(e.getMessage());
        e.printStackTrace();
    }
	  
	}
	
	private static Complaint createComplaint(String[] metadata) throws ParseException { 
	
		
		
		String dateReceived = metadata[0] ;
		String product = metadata[1];
		String subProduct = metadata[2]; 
		String issue = metadata[3];
		String subIssue = metadata[4]; 
		String company = metadata[5];
		String state = metadata[6]; 
		String zipCode = metadata[7];
		String submittedVia = metadata[8]; 
		String dateClosed = metadata[9];
		String companyResponseToConsumer = metadata[10]; 
		String timelyResponse = metadata[11];
		String consumerDisputed = metadata[12];
		String complaintId = metadata[13];
	
		
		 return new Complaint(dateReceived, product,subProduct,issue,subIssue,company,state,zipCode,submittedVia,dateClosed,companyResponseToConsumer,timelyResponse,consumerDisputed,complaintId);
    }
	
	public static List<Complaint> readBooksFromCSV(String fileName) throws ParseException {
		List<Complaint> books = new ArrayList<Complaint>(); 
		Path pathToFile = Paths.get(fileName);
		try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)){
			 String line = br.readLine();
			 while (line != null) {
				 String[] attributes = line.split(",");
				 Complaint complaint = createComplaint(attributes);
				 books.add(complaint);
				 line = br.readLine();
			 }
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		 return books;
			}
	}

	

