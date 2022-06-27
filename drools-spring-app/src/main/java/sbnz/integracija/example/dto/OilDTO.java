package sbnz.integracija.example.dto;

import sbnz.integracija.example.enums.Porosity;

public class OilDTO {
	private String name;
	private Porosity type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Porosity getType() {
		return type;
	}
	public void setType(Porosity type) {
		this.type = type;
	}
	
	public OilDTO(String name, Porosity type) {
		super();
		this.name = name;
		this.type = type;
	}
	public OilDTO() {
		super();
	}
	
	
	
}
