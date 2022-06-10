package com.ComplaintSystem;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.ComplaintSystem.loader.ComplaintLoader;
import com.ComplaintSystem.loader.ProcessComplaint;
import com.ComplaintSystem.model.Complaint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	ComplaintLoader loader;
    	List<Complaint> complaint = ComplaintLoader.readBooksFromCSV("C:\\Users\\SnehaB2\\Downloads\\complaints.csv");
    	// let's print all the person read from CSV file
    	System.out.println("Select id");
    	Scanner sc = new Scanner(System.in);
    	String id= sc.next();
    	System.out.println( complaint
    			.stream()
    			.filter(a -> a.getComplaintId() == id)
    			.collect(Collectors.toList())
    			.get(0));

    	     
    }
}
