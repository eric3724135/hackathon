package hackthon.controller;

import hackthon.domain.Store;
import hackthon.service.StoreService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@RequestMapping("/qryByArea")
	public @ResponseBody
	List<Store> qryByArea(@RequestParam("city") String city,
			@RequestParam("area") String area) {
		List<Store> result = new ArrayList<Store>();
		result = storeService.qryStoreListByArea(city, area);
		return result;
	}

	@RequestMapping("/qryByCity")
	public @ResponseBody
	List<Store> qryByCity(@RequestParam("city") String city) {
		List<Store> result = new ArrayList<Store>();
		result = storeService.qryStoreListByCity(city);
		return result;
	}
}
