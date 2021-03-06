package sbnz.integracija.example.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.AttributeConverter;

public class ListToIntegerConverter implements AttributeConverter<List<Integer>, String> {

	@Override
	public String convertToDatabaseColumn(List<Integer> attribute) {
		return attribute == null ? null : String.join(",", attribute.toString());
		
	}

	@Override
	public List<Integer> convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return Collections.emptyList();
		}else {
			String stringic1 = dbData.replace("[", "");
			String stringic2 = dbData.replace("]", "");
			System.out.println(stringic2);
			String[] stringic = stringic2.split(",");
			List<Integer> vrati = new ArrayList<Integer>();
			
			for(int i = 0; i<stringic.length; i++) {
				vrati.add(Integer.getInteger(stringic[i]));
			}
			return vrati;
			
		}
	}
    
}
