package hackthon.service;

import hackthon.domain.Medical;

import java.util.List;

public interface MedicalService {
	
	List<Medical> qryMedicalList(String keyword);
}
