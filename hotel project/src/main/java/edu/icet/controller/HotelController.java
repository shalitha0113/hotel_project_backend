package edu.icet.controller;

import edu.icet.dao.HotelEntity;
import edu.icet.dto.Hotel;
import edu.icet.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class HotelController {
    @Autowired
    HotelService service;
    @GetMapping("/hotel")
    Iterable<HotelEntity> getHotelList(){
        return service.getHotelList();
    }

    @PostMapping("/hotel")
    public void addHotel(@RequestBody Hotel hotel){
        service.addHotel(hotel);
    }

    @PutMapping("/hotel/{hotelId}")
    public HotelEntity updateHotel(@RequestBody HotelEntity hotel,@PathVariable("hotelId") Long hotelId){
        return service.updateHotel(hotel,hotelId);
    }

    @DeleteMapping("/hotel/{hotelId}")
    public String deleteHotelById(@PathVariable("hotelId") Long hotelId){
        service.deleteHotelById(hotelId);
        return "Hotel Details Deleted";
    }
}
