package com.hotelapp.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Hotel;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Integer> {
	//derived quiries
	List<Hotel> findByAddressCity(String city);
	List<Hotel> findByAddressStreetName(String location);
	List<Hotel> findByAddressState(String state);
	
	//custom quiries(JPQL)
	@Query("FROM Hotel h INNER JOIN h.menuList mn WHERE mn.menuName=?1")
	List<Hotel> getHotelsByMenu(String menuName);
	
	@Query("FROM Hotel h INNER JOIN h.address a INNER JOIN h.menuList mn WHERE a.streetName=?1 AND mn.menuName=?2")
	List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
	
	
	
}
