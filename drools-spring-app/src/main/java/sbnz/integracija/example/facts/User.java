package sbnz.integracija.example.facts;

import java.io.Serializable;
import javax.persistence.*;
import sbnz.integracija.example.enums.Role;

@Entity
@Table(name = "users")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "username", nullable = false, unique=true)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "last_name", nullable = false)
	private String lastname;
	
	@Column(name = "role", nullable = false)
	private Role role;
	
	
	
	////////////////////////////////  KONSTRUKTORI  ////////////////////////////////
	public User() {
		super();
	}

	public User(int id, String username, String password, String name, String lastname, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.role = role;
	}

	

	////////////////////////////////  GETERI I SETERI  ////////////////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
	
	
	
	
	
}
