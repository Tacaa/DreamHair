package sbnz.integracija.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sbnz.integracija.example.facts.DailyShampoo;
import sbnz.integracija.example.facts.DeepWashShampoo;
import sbnz.integracija.example.facts.Mask;
import sbnz.integracija.example.facts.Oil;
import sbnz.integracija.example.facts.Preparation;
import sbnz.integracija.example.facts.Regenerator;



public interface ProductsRepository extends JpaRepository<Preparation, Integer>{
	@Query("select distinct p from Preparation p where PREPARATION_TYPE = 'MASK'")
	List<Mask>findAllMask();
	
	@Query("select distinct p from Preparation p where PREPARATION_TYPE = 'REGENERATOR'")
	List<Regenerator>findAllRegenerators();
	
	@Query("select distinct p from Preparation p where PREPARATION_TYPE = 'DAILY_SHAMPOO'")
	List<DailyShampoo>findAllDailyShampoos();
	
	@Query("select distinct p from Preparation p where PREPARATION_TYPE = 'DEEP_WASH_SHAMPOO'")
	List<DeepWashShampoo>findAllDeepWashShampoos();
	
	@Query("select distinct p from Preparation p where PREPARATION_TYPE = 'OIL'")
	List<Oil>findAllOils();
}
