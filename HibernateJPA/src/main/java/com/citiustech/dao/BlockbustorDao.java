package com.citiustech.dao;

import java.util.List;

import com.citiustech.entity.Movie;
import com.citiustech.entity.Shop;
import com.citiustech.entity.Staff;

public class BlockbustorDao extends GenericDao{
	
	public List<Staff> fetchStaffDetail(int staff_id) {
		return entitymanagerfactory
				.createEntityManager()
				.createQuery("select s from Staff s where s.staff_id =:staff_id ", Staff.class)
				.setParameter("staff_id", staff_id)
				.getResultList();
	}

	public List<Movie> fetchMovies() {
		return entitymanagerfactory
				.createEntityManager()
				.createQuery("select distinct m.movie_name from Movie m ", Movie.class)
				.getResultList();
	}
}
