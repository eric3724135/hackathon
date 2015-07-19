package hackthon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hackthon.domain.Medical;
import hackthon.service.MedicalService;

@Service
public class MedicalServiceImpl implements MedicalService {

    @Override
    public List<Medical> qryMedicalList(String keyword) {
	List<Medical> res = new ArrayList<Medical>();
	return res;
    }

}
