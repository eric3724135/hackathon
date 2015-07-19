package hackthon.domain;

import java.util.List;

public class City {

	private String cityName;

	private List<String> AreaList;
	
	

	public City(String cityName, List<String> areaList) {
		super();
		this.cityName = cityName;
		AreaList = areaList;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<String> getAreaList() {
		return AreaList;
	}

	public void setAreaList(List<String> areaList) {
		AreaList = areaList;
	}

}
