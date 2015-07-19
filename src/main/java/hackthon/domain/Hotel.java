package hackthon.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hotel {

    /**
     * 編號
     */
    private String serialNo;
    /**
     * 電話
     */
    private String tel;
    /**
     * 最低入住金額
     */
    private int cost;
    /**
     * 飯店名
     */
    private String title;
    /**
     * 地址
     */
    private String address;
    /**
     * 市
     * */
    private String city;
    /**
     * 區
     * */
    private String location;
    /**
     * 影像列表
     */
    private List<String> imgUrl;
    /**
     * 飯店簡介
     * */
    private String xbody;

    /**
     * @return the xbody
     */
    public String getXbody() {
	return xbody;
    }

    /**
     * @param xbody
     *            the xbody to set
     */
    public void setXbody(String xbody) {
	this.xbody = xbody;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
	return longitude;
    }

    /**
     * @param longitude
     *            the longitude to set
     */
    public void setLongitude(String longitude) {
	this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
	return latitude;
    }

    /**
     * @param latitude
     *            the latitude to set
     */
    public void setLatitude(String latitude) {
	this.latitude = latitude;
    }

    /**
     * 經度
     * */
    private String longitude;
    /**
     * 緯度
     * */
    private String latitude;

    public Hotel() {
	super();
    }

    /**
     * @param serialNo
     * @param tel
     * @param cost
     * @param title
     * @param address
     * @param city
     * @param location
     * @param imgUrl
     * @param xbody
     * @param longitude
     * @param latitude
     */
    public Hotel(String serialNo, String tel, int cost, String title, String address, String city, String location,
	    List<String> imgUrl, String xbody, String longitude, String latitude) {
	super();
	this.serialNo = serialNo;
	this.tel = tel;
	this.cost = cost;
	this.title = title;
	this.address = address;
	this.city = city;
	this.location = location;
	this.imgUrl = imgUrl;
	this.xbody = xbody;
	this.longitude = longitude;
	this.latitude = latitude;
    }

    public String getSerialNo() {
	return serialNo;
    }

    public void setSerialNo(String serialNo) {
	this.serialNo = serialNo;
    }

    public String getTel() {
	return tel;
    }

    public void setTel(String tel) {
	this.tel = tel;
    }

    public int getCost() {
	return cost;
    }

    public void setCost(int cost) {
	this.cost = cost;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public List<String> getImgUrl() {
	return imgUrl;
    }

    public void setImgUrl(List<String> imgUrl) {
	this.imgUrl = imgUrl;
    }

    /**
     * @return the location
     */
    public String getLocation() {
	return location;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(String location) {
	this.location = location;
    }

    /**
     * @return the city
     */
    public String getCity() {
	return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city) {
	this.city = city;
    }

}
