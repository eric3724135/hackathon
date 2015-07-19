package hackthon.domain;

public class Medical {

	/**
	 * 醫院地址
	 */
	private String name;

	/**
	 * 醫院電話
	 */
	private String tel;

	/**
	 * 地址
	 */
	private String address;

	public Medical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medical(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
