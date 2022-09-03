package com.hotelapp.service;

import java.util.List;
import com.hotelapp.models.Menu;

public interface IMenuService {

	
	List<Menu> getMenusByHotelName(String hotelName);
}
