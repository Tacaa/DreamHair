package sbnz.integracija.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sbnz.integracija.example.facts.RegisteredUser;
import sbnz.integracija.example.facts.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findById(int id);
	public User findByUsername(String username);
	
	@Query("select r from User r where r.id = ?1")
	public RegisteredUser findRegisteredUser(int id);
}
