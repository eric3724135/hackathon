package hackthon.controller;

import java.util.ArrayList;
import java.util.List;

import hackthon.domain.Bar;
import hackthon.domain.City;
import hackthon.domain.TsvResponse;
import hackthon.parser.util.AreaUtil;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	private final int CITY_NUM = 22;

	@RequestMapping("/")
	public String welcome(Model model) {

		return "index";
	}
	
	@RequestMapping("/barChart")
	public String barChart(){
		return "barChart";
	}
	@RequestMapping("/BarChartData")
	public @ResponseBody JSONArray getBarChartData(){
		JSONObject bar = new JSONObject();
		bar.put("key", "Quantity");
		bar.put("bar", new Boolean(true));
		bar.put("color", "#ccf");
		JSONObject line = new JSONObject();
		bar.put("key", "Price");
		bar.put("color", "#333");
		JSONArray result = new JSONArray();
		result.put(bar);
		result.put(line);
		
		return result;
		
	}

	@RequestMapping("/city")
	public @ResponseBody
	List<String> getCitybyDay(@RequestParam("startCity") String city,
			@RequestParam("day") String day) {
		int index = 0;
		List<City> list = AreaUtil.getCityList();

		for (int i = 0; i < list.size(); i++) {
			if (city.equals(list.get(i).getCityName())) {
				index = i;
			}
		}
		System.out.println("list index :"+index);
		List<String> res = new ArrayList<String>();
		try {
			int dayNum = CITY_NUM / Integer.parseInt(day);

			for (int i = 0; i < (Integer.parseInt(day) - 1); i++) {
				if (dayNum * (i + 1) + index < list.size()) {
					res.add(list.get(dayNum * (i + 1) + index).getCityName());
				} else {
					res.add(list.get(dayNum * (i + 1) + index - list.size())
							.getCityName());
				}

			}
			return res;
		} catch (Exception e) {
			return null;
		}

	}

	@RequestMapping("/2")
	public String welcome2(Model model) {
		return "index2";
	}

	@RequestMapping(value = "/tsv", method = RequestMethod.GET, produces = "text/tsv")
	public @ResponseBody
	TsvResponse tsv() {
		List<Bar> res = new ArrayList<Bar>();
		res.add(new Bar("A", "0.08167"));
		res.add(new Bar("B", "0.01492"));
		res.add(new Bar("C", "0.02780"));
		res.add(new Bar("D", "0.04253"));
		res.add(new Bar("E", "0.12702"));
		res.add(new Bar("F", "0.02288"));
		res.add(new Bar("G", "0.02022"));

		return new TsvResponse(res, "data.tsv", "letter", "frequency");
	}

	@RequestMapping("/Gantt")
	public String Gantt(Model model) {
		return "Gantt";
	}
}
