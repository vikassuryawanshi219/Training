package com.hotelapp.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.repository.IHotelappRepository;


@Service
public class HotelServiceImpl implements IHotelService {
 
	@Autowired
	IHotelappRepository hotelappRepository;
	@Override
	public void addHotel(Hotel hotel) {
		hotelappRepository.save(hotel);
		}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelappRepository.save(hotel);

	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelappRepository.deleteById(hotelId);

	}

	@Override
	public List<Hotel> getAll() {
//	Sort sort=Sort.by("name");
		Sort sort= Sort.by(Direction.DESC, "name");
		return hotelappRepository.findAll(sort);
	}

	@Override
	public Hotel getById(int hotelId) {
		Optional<Hotel> hotelOpt=hotelappRepository.findById(hotelId);
		if(hotelOpt.isPresent()) {
			return hotelOpt.get();
		}
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		
		return hotelappRepository.findByCity(city);
	}

	@Override
	public List<Hotel> getByType(String type) {
		// TODO Auto-generated method stub
		return hotelappRepository.findByType(type);
	}

	@Override
	public List<Hotel> getByRating(double rating) {
		// TODO Auto-generated method stub
		return hotelappRepository.findByRating(rating);
	}

	@Override
	public List<Hotel> getByCategory(Category category) {
		
		return hotelappRepository.findByCategory(category);
	}

}
