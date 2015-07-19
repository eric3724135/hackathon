package hackthon.service;

import hackthon.domain.Store;

import java.util.List;

public interface StoreService {
	List<Store> qryStoreListByCity(String city);

	List<Store> qryStoreListByArea(String city, String Area);
	
	List<Store> getStoreByLngLat(String lng,String lat);
}
