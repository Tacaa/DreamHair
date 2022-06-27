package sbnz.integracija.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.Diary;
import sbnz.integracija.example.facts.PehValues;

public interface PehValuesRepository extends JpaRepository<PehValues, Integer>{

}
