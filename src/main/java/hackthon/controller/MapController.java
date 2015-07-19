package hackthon.controller;

import hackthon.domain.Hotel;
import hackthon.domain.Marker;
import hackthon.domain.Medical;
import hackthon.domain.Store;
import hackthon.service.HotelService;
import hackthon.service.MedicalService;
import hackthon.service.StoreService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/map")
public class MapController {
	@Autowired
	private HotelService hotelService;
	@Autowired
	private MedicalService medicalService;
	@Autowired
	private StoreService storeService;

	@RequestMapping("/")
	public @ResponseBody
	List<Marker> getInfoByHotel(@RequestParam("id") String id) {
		List<Marker> res = new ArrayList<Marker>();
		Hotel hotel = hotelService.findById(id);
		List<Store> storeLsit = storeService.qryStoreListByArea(
				hotel.getCity(), hotel.getLocation());
		List<Medical> medicalLsit = medicalService.qryMedicalList(hotel
				.getCity());
		res.add(new Marker(hotel.getAddress(), hotel.getTitle(), hotel
				.getTitle()));
		for (Store st : storeLsit) {
			res.add(new Marker(st.getAddress(), st.getName(), ""));
		}
		for (Medical md : medicalLsit) {
			res.add(new Marker(md.getAddress(), md.getName(), ""));
		}

		return res;
	}
}
