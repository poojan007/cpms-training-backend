package bt.gov.rbp.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bt.gov.rbp.test.entity.Village;

@Repository
public interface VillageRepository extends JpaRepository<Village, Integer> {

	@Query(value = "SELECT * FROM village WHERE gewog_id=?1", nativeQuery = true)
	List<Village> getAllVillageByNativeQuery(int gewogId);
	
	List<Village> findByGewogId(int gewogId);
}
