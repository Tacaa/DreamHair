package sbnz.integracija.example.converter;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.AttributeConverter;

import sbnz.integracija.example.enums.HairState;

public class ListToHairStateConverter implements AttributeConverter<List<HairState>, String> {

	@Override
	public String convertToDatabaseColumn(List<HairState> attribute) {
		 return attribute == null ? null : String.join(",", attribute.toString());
	}

	@Override
	public List<HairState> convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return Collections.emptyList();
		}else {
			
			String stringic1 = dbData.replace("[", "");
			String stringic2 = dbData.replace("]", "");
			String[] stringic = stringic2.split(",");
			List<HairState> vrati = new ArrayList<HairState>();
			
			for(int i = 0; i<stringic.length; i++) {
				
				HairState hs = HairState.values()[Integer.parseInt(stringic[i])];
				vrati.add(hs);
			}
			return vrati;
			
		}
	
	}

	
    
}
