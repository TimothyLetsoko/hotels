package com.timothy.hotels.service;

import com.timothy.hotels.entity.Hotel;
import com.timothy.hotels.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    @Autowired
    private HotelRepository repo;

    public Hotel saveHotel(Hotel hotel){
        return repo.save(hotel);
    }
}
