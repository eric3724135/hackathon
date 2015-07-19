package hackthon.parser.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import hackthon.domain.Hotel;

@Repository
public class HotelParser implements ApplicationListener<ContextRefreshedEvent> {

    // private static final String insertHotalDetailTemplate =
    // "insert into hotel (serial_no, tel, cost, title, address) values('%s', '%s', %d, '%s', '%s');";
    //
    // private static final String insertHotalImgUrlTemplate =
    // "insert into hotel_img (serial_no, img_url) values('%s', '%s');";

    public static List<Hotel> hotelList = new ArrayList<Hotel>();

    //
    // public void back() throws Exception {
    // URL url = HotelParser.class.getResource("/Hotel.json");
    // Pattern pattern = Pattern.compile("(http://){1}[\\w./]+");
    // Pattern costPattern = Pattern.compile("\\d+");
    // Pattern filePattern = Pattern.compile("(.jpg)$");
    //
    // InputStream is = url.openStream();
    // BufferedReader reader = new BufferedReader(new InputStreamReader(is,
    // Charset.forName("UTF-8")));
    // StringBuffer buffer = new StringBuffer();
    // int read;
    // char[] chars = new char[1024];
    // while ((read = reader.read(chars)) != -1) {
    // buffer.append(chars, 0, read);
    // }
    // reader.close();
    // String jsonStr = buffer.toString();
    // Type listType = new TypeToken<ArrayList<HotelDTO>>() {
    // }.getType();
    //
    // List<HotelDTO> hotelList = new Gson().fromJson(jsonStr, listType);
    //
    // Set<String> hotelSet = new HashSet();
    //
    // for (HotelDTO hotel : hotelList) {
    // Matcher matcherCost = costPattern.matcher(hotel.getMemo_cost());
    // int cost = 0;
    // if (matcherCost.find()) {
    // cost = new Integer(matcherCost.group());
    // }
    // System.err.println(hotel.getRownumber());
    // hotelSet.add(String.format(insertHotalDetailTemplate,
    // hotel.getRownumber().trim(), hotel.getMemo_tel(),
    // cost, hotel.getStitle(), hotel.getAddress()));
    // List<String> hotelPicUrl = new ArrayList<>();
    //
    // Matcher matcherFile = pattern.matcher(hotel.getFile());
    //
    // while (matcherFile.find()) {
    // System.err.println(matcherFile.groupCount());
    // System.err.println(matcherFile.group());
    // Matcher fileMatcher = filePattern.matcher(matcherFile.group());
    // if (fileMatcher.find()) {
    // hotelSet.add(String.format(insertHotalImgUrlTemplate,
    // hotel.getRownumber().trim(),
    // matcherFile.group()));
    // }
    // }
    //
    // }
    //
    // PrintWriter printW = new PrintWriter("HotelInsert.sql");
    // for (String content : hotelSet) {
    // printW.println(content);
    // }
    // printW.close();
    // }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
	try {
//	    URL url = HotelParser.class.getResource("/Hotel.json");
//	    Pattern pattern = Pattern.compile("(http://){1}[\\w./]+");
//	    Pattern costPattern = Pattern.compile("\\d+");
//	    Pattern filePattern = Pattern.compile("(.jpg)$");
//	    Pattern cityPattern = Pattern.compile("[\\u4e00-\\u9fa5_a-zA-Z0-9]+(市){1}");
//	    Pattern locationPattern = Pattern.compile("[\\u4e00-\\u9fa5_a-zA-Z0-9]+(區){1}");
//
//	    InputStream is = url.openStream();
//	    BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//	    StringBuffer buffer = new StringBuffer();
//	    int read;
//	    char[] chars = new char[1024];
//	    while ((read = reader.read(chars)) != -1) {
//		buffer.append(chars, 0, read);
//	    }
//	    reader.close();
//	    String jsonStr = buffer.toString();
//	    Type listType = new TypeToken<ArrayList<HotelDTO>>() {
//	    }.getType();
//
//	    List<HotelDTO> tempHotelList = new Gson().fromJson(jsonStr, listType);
//
//	    for (HotelDTO hotel : tempHotelList) {
//		String city = "";
//		String location = "";
//		Matcher matchCity = cityPattern.matcher(hotel.getAddress());
//		Matcher matchLocation = locationPattern.matcher(hotel.getAddress());
//		if (matchCity.find()) {
//		    city = matchCity.group();
//		}
//		if (matchLocation.find()) {
//		    location = matchLocation.group();
//		}
//
//		Hotel hotelDomain = new Hotel(hotel.getRownumber(), hotel.getMemo_tel(), 0, hotel.getStitle(),
//		        hotel.getAddress(), city, location, null, hotel.getXbody(), hotel.getLongitude(),
//		        hotel.getLatitude());
//		Matcher matcherCost = costPattern.matcher(hotel.getMemo_cost());
//		if (matcherCost.find()) {
//		    hotelDomain.setCost(new Integer(matcherCost.group()));
//		}
//		List<String> hotelPicUrl = new ArrayList<>();
//
//		Matcher matcherFile = pattern.matcher(hotel.getFile());
//
//		while (matcherFile.find()) {
//		    Matcher fileMatcher = filePattern.matcher(matcherFile.group());
//		    if (fileMatcher.find()) {
//			hotelPicUrl.add(matcherFile.group());
//		    }
//		}
//		hotelDomain.setImgUrl(hotelPicUrl);
//		hotelList.add(hotelDomain);
//	    }
	} catch (Exception e) {

	}
    }
}
