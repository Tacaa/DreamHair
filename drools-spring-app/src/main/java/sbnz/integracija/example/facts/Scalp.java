package sbnz.integracija.example.facts;

import java.io.Serializable;

import sbnz.integracija.example.enums.*;

public class Scalp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ScalpSensitivity scalpSensitivity;
	private ScalpType scalpType;
	
	public Scalp(ScalpSensitivity scalpSensitivity, ScalpType scalpType) {
		super();
		this.scalpSensitivity = scalpSensitivity;
		this.scalpType = scalpType;
	}

	public Scalp() {
		super();
	}

	public ScalpSensitivity getScalpSensitivity() {
		return scalpSensitivity;
	}

	public void setScalpSensitivity(ScalpSensitivity scalpSensitivity) {
		this.scalpSensitivity = scalpSensitivity;
	}

	public ScalpType getScalpType() {
		return scalpType;
	}

	public void setScalpType(ScalpType scalpType) {
		this.scalpType = scalpType;
	}

	@Override
	public String toString() {
		return "Scalp [scalpSensitivity=" + scalpSensitivity + ", scalpType=" + scalpType + "]";
	}
	
	
	
}
