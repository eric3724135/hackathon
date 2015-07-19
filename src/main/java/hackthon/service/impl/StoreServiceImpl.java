package hackthon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hackthon.domain.Store;
import hackthon.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	@Override
	public List<Store> qryStoreListByCity(String city) {
		List<Store> res = new ArrayList<Store>();
		res.add(new Store("便利商店", "0123456789", "121.531597", "25.044475",
				"台北市中正區八德路一段43巷2號"));
		res.add(new Store("便利商店2", "0123456789", "121.518534", "25.040793",
				"台北市中正區中華路二段307巷46號"));
		res.add(new Store("全家南機場店", "0123456789", "121.505774", "25.028401",
				"台北市中正區中華路二段311巷1號"));
		return res;
	}

	@Override
	public List<Store> qryStoreListByArea(String city, String Area) {
		List<Store> res = new ArrayList<Store>();
		res.add(new Store("便利商店", "0123456789", "121.531597", "25.044475",
				"台北市中正區八德路一段43巷2號"));
		res.add(new Store("便利商店2", "0123456789", "121.518534", "25.040793",
				"台北市中正區中華路二段307巷46號"));
		res.add(new Store("全家南機場店", "0123456789", "121.505774", "25.028401",
				"台北市中正區中華路二段311巷1號"));
		return res;
	}

	@Override
	public List<Store> getStoreByLngLat(String lng, String lat) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
