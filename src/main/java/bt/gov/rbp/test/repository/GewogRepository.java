package bt.gov.rbp.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import bt.gov.rbp.test.entity.Gewog;

@Repository
public interface GewogRepository extends JpaRepository<Gewog, Integer> {

	@Query(value = "SELECT * FROM gewog WHERE dzongkhag_id=?1", nativeQuery = true)
	List<Gewog> getAllGewogByNativeQuery(int dzongkhagId);
	
	List<Gewog> findByDzongkhagId(int dzongkhagId);
}
