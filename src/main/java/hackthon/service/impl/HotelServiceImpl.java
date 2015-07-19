package hackthon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hackthon.domain.Hotel;
import hackthon.parser.util.HotelParser;
import hackthon.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

    @Override
    public List<Hotel> qryHotelList(String keyword, int cost) {
	List<Hotel> sourceList = new ArrayList<Hotel>(HotelParser.hotelList);
	List<Hotel> resultList = new ArrayList<Hotel>();
	for (Hotel hotel : sourceList) {
	    if (hotel.getTitle().contains(keyword) || hotel.getCost() == cost) {
		resultList.add(hotel);
	    }
	}
	return resultList;
    }

    @Override
    public List<Hotel> qryHotelByArea(String city, String area) {
	List<Hotel> sourceList = new ArrayList<Hotel>(HotelParser.hotelList);
	List<Hotel> resultList = new ArrayList<Hotel>();
	for (Hotel hotel : sourceList) {
	    if (hotel.getCity().contains(city) && hotel.getLocation().contains(area)) {
		resultList.add(hotel);
	    }
	}
	return resultList;
    }

    @Override
    public List<Hotel> qryHotelByCity(String city) {
	List<Hotel> sourceList = new ArrayList<Hotel>(HotelParser.hotelList);
	List<Hotel> resultList = new ArrayList<Hotel>();
	for (Hotel hotel : sourceList) {
	    if (hotel.getCity().contains(city)) {
		resultList.add(hotel);
	    }
	}
	return resultList;
    }

    @Override
    public Hotel findById(String id) {
	List<Hotel> sourceList = new ArrayList<Hotel>(HotelParser.hotelList);
	Hotel result = new Hotel();
	for (Hotel hotel : sourceList) {
	    if (hotel.getSerialNo().equals(id)) {
		result = hotel;
	    }
	}
	return result;
    }

}
