package hackthon.parser.util;

public class HotelDTO {

    /**
     * 編號
     */
    private String rownumber;
    /**
     * 電話
     */
    private String memo_tel;
    /**
     * 最低入住金額
     */
    private String memo_cost;
    /**
     * 飯店名
     */
    private String stitle;
    /**
     * 地址
     */
    private String address;
    /**
     * 影像列表
     */
    private String file;
    /**
     * 飯店簡介
     * */
    private String xbody;
    /**
     * 經度
     * */
    private String longitude;
    /**
     * 緯度
     * */
    private String latitude;

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

    public HotelDTO() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @return the memo_tel
     */
    public String getMemo_tel() {
	return memo_tel;
    }

    /**
     * @return the rownumber
     */
    public String getRownumber() {
	return rownumber;
    }

    /**
     * @param rownumber
     *            the rownumber to set
     */
    public void setRownumber(String rownumber) {
	this.rownumber = rownumber;
    }

    /**
     * @param memo_tel
     *            the memo_tel to set
     */
    public void setMemo_tel(String memo_tel) {
	this.memo_tel = memo_tel;
    }

    /**
     * @return the memo_cost
     */
    public String getMemo_cost() {
	return memo_cost;
    }

    /**
     * @param memo_cost
     *            the memo_cost to set
     */
    public void setMemo_cost(String memo_cost) {
	this.memo_cost = memo_cost;
    }

    /**
     * @return the stitle
     */
    public String getStitle() {
	return stitle;
    }

    /**
     * @param stitle
     *            the stitle to set
     */
    public void setStitle(String stitle) {
	this.stitle = stitle;
    }

    /**
     * @return the address
     */
    public String getAddress() {
	return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
	this.address = address;
    }

    /**
     * @return the file
     */
    public String getFile() {
	return file;
    }

    /**
     * @param file
     *            the file to set
     */
    public void setFile(String file) {
	this.file = file;
    }

}
