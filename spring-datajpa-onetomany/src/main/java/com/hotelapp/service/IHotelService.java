package com.hotelapp.service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.Query;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;

public interface IHotelService {
	
	//in built
	void addHotel (Hotel hotel);
	void updateHotel(Hotel hotel);
	void deleteHotel(int hotelId);
	
	List<Hotel> getAll();
	Hotel getById(int hotelId);
	
	//derived queries
	List<Hotel> getByCity(String city);
	List<Hotel> getByType(String type);
	List<Hotel> getByRating(double rating);
	
	
//	//custom queries
//	@Query("from Hotel h inner join h.itemList i where i.itemName=?1")
//	List<Hotel>findByItemName(String name);
//	
//	@Query("from Hotel h inner join h.itemList i where i.itemName=?1 or i.category=?2")
//	List<Hotel>findByItemNameCategory(String itemName, String category);
//	
//	@Query("from Hotel h inner join h.itemList i where i.cuisine=?1")
//	List<Hotel>findByCuisine(String cuisine);
//	
	
	List<Hotel>getByCategory(Category category);
//	
//	@Query("from Hotel h inner join h.itemList i where i.itemName=?1")
//	List<Hotel>findByCuisineAndType(String cuisine,String type);
//	
//	@Query("from Hotel h inner join h.itemList i where i.itemName=?1")
//	List<Hotel>findByItemName(String name);
//	
	
}
