package edu.icet.service;
import edu.icet.dao.HotelEntity;
import edu.icet.dto.Hotel;
import edu.icet.repository.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    //Get hotel list
    public Iterable<HotelEntity> getHotelList(){
        return hotelRepository.findAll();
    }

    //Add new hotel to list
    public void addHotel(Hotel hotel){
        HotelEntity entity=new HotelEntity();
        entity.setName(hotel.getName());
        entity.setLocation(hotel.getLocation());
        entity.setDescription(hotel.getDescription());
        entity.setRoomCount(hotel.getRoomCount());
        entity.setEmail(hotel.getEmail());
        entity.setContactNo(hotel.getContactNo());
        hotelRepository.save(entity);
    }

    //Update hotel details
    public HotelEntity updateHotel(HotelEntity hotel,Long hotelId){
        HotelEntity entityById = hotelRepository.findById(hotelId).get();
        if(entityById != null && !"".equalsIgnoreCase(String.valueOf(entityById))){
            entityById.setName(hotel.getName());
            entityById.setLocation(hotel.getLocation());
            entityById.setDescription(hotel.getDescription());
            entityById.setRoomCount(hotel.getRoomCount());
            entityById.setEmail(hotel.getEmail());
            entityById.setContactNo(hotel.getContactNo());
        }else {
            log.debug("Empty Value updated for Hotel Details");
        }return  hotelRepository.save(entityById);
    }

    //Remove hotel from list
    public void deleteHotelById(Long hotelId){
        hotelRepository.deleteById(hotelId);
    }
}
