package sbnz.integracija.example.converter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.AttributeConverter;

public class ListToLocalDateTimeConverter implements AttributeConverter<List<LocalDateTime>, String>{

	@Override
	public String convertToDatabaseColumn(List<LocalDateTime> attribute) {
		return attribute == null ? null : String.join(",", attribute.toString());
	}

	@Override
	public List<LocalDateTime> convertToEntityAttribute(String dbData) {
		if(dbData == null) {
			return Collections.emptyList();
		}else {
			String[] stringic = dbData.split(",");
			List<LocalDateTime> vrati = new ArrayList<LocalDateTime>();
			
			for(int i = 0; i<stringic.length; i++) {
				LocalDateTime ldt = LocalDateTime.parse(stringic[i]);
				vrati.add(ldt);
			}
			return vrati;
			
		}
	}

}
