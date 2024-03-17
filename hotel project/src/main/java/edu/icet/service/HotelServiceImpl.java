package edu.icet.service;

import edu.icet.dto.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    public List<Hotel> getHotelList(){
        ArrayList<Hotel> hotelList=new ArrayList();
        hotelList.add(new Hotel("Hotel 1","Galle","","","",""));
        hotelList.add(new Hotel("Hotel 2","","Panadura","","",""));
        hotelList.add(new Hotel("Hotel 3","","Ratnapura","","",""));
        return hotelList;
    }
}
