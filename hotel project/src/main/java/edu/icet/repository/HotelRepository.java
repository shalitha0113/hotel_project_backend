package edu.icet.repository;

import edu.icet.dao.HotelEntity;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<HotelEntity,Long> {
}
