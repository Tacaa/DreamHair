package sbnz.integracija.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.Preparations;

public interface PreparationsRepository extends JpaRepository<Preparations, Integer>{
	public Preparations findById(int id);
}
