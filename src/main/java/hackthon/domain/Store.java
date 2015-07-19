package hackthon.domain;

public class Store {

	/**
	 * 店名
	 */
	private String name;
	/**
	 * 電話
	 */
	private String tel;

	/**
	 * 經度
	 */
	private String longitude;

	/**
	 * 緯度
	 */
	private String latitude;

	/**
	 * 地址
	 */
	private String address;

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String name, String tel, String longitude, String latitude,
			String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
