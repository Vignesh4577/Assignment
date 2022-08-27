package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}

	@Autowired
	HotelService hotelService;

	@Autowired
	DeliveryService deliveryService;
	
	@Autowired
	MenuService menuService;

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("Jp Nagar", "Mangalore", 575461, "Karnataka");
		Menu menu = new Menu("Idli", 140);
		Menu menu1 = new Menu("Dosa", 135);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu, menu1));
		Delivery delivery = deliveryService.getDeliveryByPartner("uber");
		Set<Delivery> deliveries = new HashSet<>(Arrays.asList(delivery));
		Hotel hotel = new Hotel("Bhagani Hotel", address, menuList, deliveries);
		hotelService.addHotel(hotel);
		
//		Hotel hotel = hotelService.getHotelById(102);
//		System.out.println(hotel);
//		hotel.getAddress().setCity("karwar");
//		System.out.println(hotel);
//		hotelService.updateHotel(hotel);
		
//		System.out.println("*******************************************************");
//		hotelService.getHotelsByCity("Bangalore")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getCity()));
//		System.out.println("*******************************************************");
//		
//		System.out.println("*******************************************************");
//		hotelService.getHotelsByLocation("Rajajinagar")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+h.getMenuList()));
//		System.out.println("*******************************************************");
//		System.out.println("*******************************************************");
//		hotelService.getHotelsByMenu("Idli")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
//		
//		System.out.println("*******************************************************");
//		hotelService.getHotelsByDelivery("swiggy")
//		
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
//		System.out.println("*******************************************************");
//		
//		hotelService.getHotelsByMenu("Idli")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
//		
//		System.out.println("*******************************************************");
//		
//		hotelService.getHotelsByDelivery("swiggy")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
		System.out.println("*******************************************************");
		
//		hotelService.getHotelsByLocationAndMenu("Jp Nagar", "Idli")
//		.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getCity()));
		
		menuService.getMenusByHotel("A2B")
		.forEach((m)->System.out.println(m.getMenuName()+" "+m.getPrice()));
	}

}
