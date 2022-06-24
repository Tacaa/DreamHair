package sbnz.integracija.example.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
				System.out.println("U CONVERTERU SAM!!!");
				System.out.println(stringic[i] + "\n\n");
				
				if(stringic[i].charAt(0) == '[') {
					String novi = stringic[i].replace("[", "");
					System.out.println(novi);
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
					LocalDateTime ldt = LocalDateTime.parse(novi, formatter);
					vrati.add(ldt);
				}else if(stringic[i].charAt(stringic[i].length()-1) == ']') {
					String novi = stringic[i].replace("]", "");
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
					LocalDateTime ldt = LocalDateTime.parse(novi, formatter);
					vrati.add(ldt);
				}else {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
					LocalDateTime ldt = LocalDateTime.parse(stringic[i], formatter);
					vrati.add(ldt);
				}
				
			}
			return vrati;
			
		}
	}

}
