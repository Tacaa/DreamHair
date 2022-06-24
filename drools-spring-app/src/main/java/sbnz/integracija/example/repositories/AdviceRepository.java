package sbnz.integracija.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.Advice;

public interface AdviceRepository extends JpaRepository<Advice, Integer>{
	
}
