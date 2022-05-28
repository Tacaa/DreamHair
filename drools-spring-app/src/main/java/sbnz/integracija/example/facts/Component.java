package sbnz.integracija.example.facts;

import java.io.Serializable;

import sbnz.integracija.example.enums.ComponentType;

public class Component implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private ComponentType type;
	
	
	public Component(String name, ComponentType type) {
		super();
		this.name = name;
		this.type = type;
	}


	public Component() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComponentType getType() {
		return type;
	}

	public void setType(ComponentType type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Component [name=" + name + ", type=" + type + "]";
	}
	
	
	
	
	
}
