package sbnz.integracija.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbnz.integracija.example.facts.Advice;
import sbnz.integracija.example.facts.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
	public Review findById(int id);
}
