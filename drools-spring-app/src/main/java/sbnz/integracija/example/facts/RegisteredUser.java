package sbnz.integracija.example.facts;

import java.io.Serializable;

import sbnz.integracija.example.enums.Medal;
import sbnz.integracija.example.enums.Role;

public class RegisteredUser extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Hair hair;
	private Preparations preparations;
	private Medal medal;
	private Advice advices;
	private Diary diary;
	
	public RegisteredUser(int id, String username, String password, String name, String lastname, Role role, Hair hair,
			Preparations preparations, Medal medal, Advice advices, Diary diary) {
		super(id, username, password, name, lastname, role);
		this.hair = hair;
		this.preparations = preparations;
		this.medal = medal;
		this.advices = advices;
		this.diary = diary;
	}

	

	public RegisteredUser(int id, String username, String password, String name, String lastname, Role role) {
		super(id, username, password, name, lastname, role);
	}



	public Hair getHair() {
		return hair;
	}

	public void setHair(Hair hair) {
		this.hair = hair;
	}

	public Preparations getPreparations() {
		return preparations;
	}

	public void setPreparations(Preparations preparations) {
		this.preparations = preparations;
	}

	public Medal getMedal() {
		return medal;
	}

	public void setMedal(Medal medal) {
		this.medal = medal;
	}

	public Advice getAdvices() {
		return advices;
	}

	public void setAdvices(Advice advices) {
		this.advices = advices;
	}

	public Diary getDiary() {
		return diary;
	}

	public void setDiary(Diary diary) {
		this.diary = diary;
	}

	@Override
	public String toString() {
		return "RegisteredUser [hair=" + hair + ", preparations=" + preparations + ", medal=" + medal + ", advices="
				+ advices + ", diary=" + diary + "]";
	}
	
	
	
}
