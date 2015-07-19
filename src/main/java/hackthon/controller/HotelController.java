package hackthon.controller;

import hackthon.domain.Hotel;
import hackthon.service.HotelService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

@Controller
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@RequestMapping("/")
	public String choiseCity(@RequestParam("city") String city, Model model) {
		List<Hotel> result;
		result = hotelService.qryHotelByCity(city);
		model.addAttribute("hotels", result);
		return "hotel";
	}

	@RequestMapping("/hotel/{id}")
	public String findByIdPage(@PathVariable("id") String id, Model model) {
		Hotel res = this.findById(id);
		model.addAttribute("hotel", res);

		return "hotelDetail";
	}

	@RequestMapping("/hotelDetail/{id}")
	public @ResponseBody
	Hotel findById(@PathVariable("id") String id) {
		Hotel result = hotelService.findById(id);
		return result;
	}

	@RequestMapping("/qry")
	public @ResponseBody
	List<Hotel> qryHotel(@RequestParam("keyword") String keyword,
			@RequestParam("cost") int cost) {
		List<Hotel> result = new ArrayList<>();
		result = hotelService.qryHotelList(keyword, cost);

		return result;
	}

	@RequestMapping("/hotelJson")
	public @ResponseBody
	List<Hotel> cityJson(@RequestParam("city") String city) {

		return hotelService.qryHotelByCity(city);
	}

}
