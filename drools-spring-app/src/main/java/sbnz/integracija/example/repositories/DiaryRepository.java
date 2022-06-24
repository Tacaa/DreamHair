package sbnz.integracija.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.Diary;
import sbnz.integracija.example.facts.Role;

public interface DiaryRepository extends JpaRepository<Diary, Integer>{
	
	
	public Diary findById(int id);
}
