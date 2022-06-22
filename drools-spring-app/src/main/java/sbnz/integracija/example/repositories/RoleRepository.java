package sbnz.integracija.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	public Role findByName(String name);
}
