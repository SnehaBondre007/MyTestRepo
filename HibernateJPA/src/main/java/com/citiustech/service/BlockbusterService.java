package com.citiustech.service;

import java.time.LocalDate;
import java.util.List;

import com.citiustech.dao.BlockbustorDao;
import com.citiustech.dao.GenericDao;
import com.citiustech.entity.Customer;
import com.citiustech.entity.Movie;
import com.citiustech.entity.MovieShopLink;
import com.citiustech.entity.OrderDetails;
import com.citiustech.entity.Shop;
import com.citiustech.entity.Staff;

public class BlockbusterService {
	
	public void withdraw(int customer_id, int registered_id) {
		GenericDao dao = new GenericDao();
		Customer cust = dao.findById(Customer.class, customer_id);
		Movie movie = dao.findById(Movie.class, registered_id);
		MovieShopLink link = dao.findById(MovieShopLink.class, movie.getMovie_id());
		link.setCopies(link.getCopies()-1);
		
		dao.save(link);
			
			OrderDetails details = new OrderDetails();
		
			details.setOrder_type("issued");
			details.setOrderPlacedOn(LocalDate.of(2013, 9, 9));
			details.setOrderReturnDate(LocalDate.of(2013, 9, 11));
			details.setTotalCost(200);
			dao.save(details);
		}
	
	public void returned(int customer_id, int registered_id) {
		GenericDao dao = new GenericDao();
		Customer cust = dao.findById(Customer.class, customer_id);
		Movie movie = dao.findById(Movie.class, registered_id);
		MovieShopLink link = dao.findById(MovieShopLink.class, movie.getMovie_id());
		link.setCopies(link.getCopies()+1);
		
		dao.save(link);
			
			OrderDetails details = new OrderDetails();
		
			details.setOrder_type("return");
			details.setOrderPlacedOn(LocalDate.of(2013, 10, 9));
			details.setOrderReturnDate(LocalDate.of(2013, 12, 11));
			details.setTotalCost(400);
			dao.save(details);
		}
	
		public List<Staff> fetchStaffDetail(int staff_id) {
		BlockbustorDao dao = new BlockbustorDao();
		return dao.fetchStaffDetail(staff_id);
		
	}
		public List<Movie> fetchAllMovies(){
			BlockbustorDao dao = new BlockbustorDao();
			return dao.fetchMovies();
		}
	}

