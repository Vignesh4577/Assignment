package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hotelapp.models.Address;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.IHotelService;
import com.hotelapp.service.IMenuService;


@SpringBootApplication
public class SpringHotelappRestapi1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapi1Application.class, args);
	}

	@Autowired
	IHotelService hotelService;
	
	@Autowired
	IMenuService menuService;

	@Override
	public void run(String... args) throws Exception {

//		Address address = new Address("RK nagar", "Mangalore", 5770045, "karnataka");
//		
//		Menu menu = new Menu("Idli", 30);
//		Menu menu1 = new Menu("upma", 40);
//		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu, menu1));
//
//		Hotel hotel = new Hotel("Spicy World", address, menuList);
//		hotelService.addHotel(hotel);

//		Hotel hotel = hotelService.getHotelById(3);
//		System.out.println(hotel);
//		hotel.getAddress().setCity("karwar");
//		
//		hotelService.updateHotel(hotel);
//		hotel = hotelService.getHotelById(3);
//		System.out.println(hotel);

//		hotelService.getHotelsByCity("Davangere").stream().forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getCity()));
//		System.out.println("*********************************************************");
//		hotelService.getHotelsByLocation("RK nagar").stream().forEach((h)->System.out.println(h.getHotelName()+" "+h.getMenuList()));
//		System.out.println("*********************************************************");
//		hotelService.getHotelsByState("karnataka").stream().forEach(System.out::println);
//		System.out.println("*********************************************************");
//		System.out.println("*********************************************************");
//		hotelService.getHotelsByMenu("Idli").stream()
//				.forEach((h) -> System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
//		hotelService.getHotelsByLocationAndMenu("Gundi Circle", "Benne Dose").stream()
//				.forEach((h) -> System.out.println("Hotel Name -> "+h.getHotelName() +" || "+"City -> "+ h.getAddress().getCity()));

		menuService.getMenusByHotelName("Koturewshwara")
		           .forEach((m)->System.out.println(m.getMenuName()+" "+m.getPrice()));
	}

}
