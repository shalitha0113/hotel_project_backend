package edu.icet.service;

import edu.icet.dao.HotelEntity;
import edu.icet.dto.Hotel;

public interface HotelService {
    //Get all Hotel list
    Iterable<HotelEntity> getHotelList();
    void addHotel(Hotel hotel);

    HotelEntity updateHotel(HotelEntity hotel,Long hotelId);
    void deleteHotelById(Long hotelId);
}
