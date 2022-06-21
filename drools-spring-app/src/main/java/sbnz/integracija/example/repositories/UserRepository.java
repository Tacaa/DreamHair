package sbnz.integracija.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findById(int id);
	public User findByUsername(String username);
}
