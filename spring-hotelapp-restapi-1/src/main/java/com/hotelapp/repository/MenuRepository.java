package com.hotelapp.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hotelapp.models.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

	//Derived query
    //List<Menu> findByHotelHotelName(String hotelName); 
    
    //@query with JPQl
//	@Query("FROM Menu m INNER JOIN m.hotel h WHERE h.hotelName=?1")
//	List<Menu> findByHotelHotelName(String hotelName);
	
	//@query with sql Native qurey
	@Query(value = "select * from menu m inner join hotel h on m.hotel_id=h.hotel_id where h.hotel_name=?1 ",nativeQuery = true)
	List<Menu> findByHotelHotelName(String hotelName);
    
}
