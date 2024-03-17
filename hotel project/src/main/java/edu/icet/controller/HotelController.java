package edu.icet.controller;

import edu.icet.dto.Hotel;
import edu.icet.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class HotelController {
    @Autowired
    HotelService service;
    @GetMapping("/hotel")
    List<Hotel> getHotelList(){
        return service.getHotelList();
    }
}
