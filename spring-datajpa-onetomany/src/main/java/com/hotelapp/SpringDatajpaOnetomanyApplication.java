package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Cuisine;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}
	
	@Autowired
    IHotelService  hotelService;
    
   

    @Override
	public void run(String... args) throws Exception {
//		Item item1 =new Item("Chowmine",Category.FASTFOOD,Cuisine.CHINESE,Type.VEG, 100);
//		Item item2 =new Item("Diet coke",Category.BAVERAGES,Cuisine.GERMAN,Type.VEG, 70);
//		Item item3 =new Item("Gulabjammun",Category.DESSERT,Cuisine.INDIAN,Type.VEG, 100);
//		Set<Item> items = new HashSet<>(Arrays.asList(item1,item2,item3));
//		
//		Hotel hotel= new Hotel("Mainland",Type.VEG,"Hyderabad",4.5,items);
//		hotelService.addHotel(hotel);
//		
//		Item item4 =new Item("Biryani",Category.MAINCOURSE,Cuisine.INDIAN,Type.NONVEG, 500);
//		Item item5 =new Item("Icecream",Category.DESSERT,Cuisine.ITALIAN,Type.VEG, 400);
//		Item item6 =new Item("Pizza",Category.FASTFOOD,Cuisine.ITALIAN,Type.VEG, 800);
//		Set<Item> itemList1 = new HashSet<>(Arrays.asList(item4,item5,item6));
//		
//		Hotel hotel1= new Hotel("Taj",Type.NONVEG,"Mumbai",5,itemList1);
//		hotelService.addHotel(hotel1);
		
		hotelService.getAll().forEach(System.out::println);
		hotelService.getByCategory(Category.FASTFOOD).forEach(System.out::println);
		
	}

}
