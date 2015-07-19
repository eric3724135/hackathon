package hackthon.controller;

import hackthon.domain.Medical;
import hackthon.service.MedicalService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Medical")
public class MedicalConreoller {
	@Autowired
	private MedicalService medicalService;

	@RequestMapping("/qry")
	public @ResponseBody
	List<Medical> qryHotel(@RequestParam("keyword") String keyword) {
		List<Medical> result = new ArrayList<Medical>();
		result = medicalService.qryMedicalList(keyword);
		return result;
	}
}
