package com.timothy.hotels.controller;

import com.timothy.hotels.entity.Hotel;
import com.timothy.hotels.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
    @Autowired
    private HotelService service;

    @PostMapping("/hotel")
    public Hotel saveHotel(@RequestBody Hotel hotel){
        return service.saveHotel(hotel);
    }
}
