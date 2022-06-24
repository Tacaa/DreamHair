package sbnz.integracija.example.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.AttributeConverter;

import sbnz.integracija.example.enums.HairState;

public class ListToDoubleConverter implements AttributeConverter<List<Double>, String>{

	@Override
	public String convertToDatabaseColumn(List<Double> attribute) {
		return attribute == null ? null : String.join(",", attribute.toString());
		
	}

	@Override
	public List<Double> convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return Collections.emptyList();
		}else {
			String stringic1 = dbData.replace("[", "");
			String stringic2 = dbData.replace("]", "");
			System.out.println(stringic2);
			String[] stringic = stringic2.split(",");
			List<Double> vrati = new ArrayList<Double>();
			
			for(int i = 0; i<stringic.length; i++) {
				vrati.add(Double.valueOf(stringic[i]));
			}
			return vrati;
			
		}
	}

}
