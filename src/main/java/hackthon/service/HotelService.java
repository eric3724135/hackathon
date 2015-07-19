package hackthon.service;

import hackthon.domain.Hotel;

import java.util.List;

public interface HotelService {

	List<Hotel> qryHotelList(String keyword, int cost);

	List<Hotel> qryHotelByArea(String city, String area);

	List<Hotel> qryHotelByCity(String city);

	Hotel findById(String id);
}
