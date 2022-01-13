package bt.gov.rbp.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt.gov.rbp.test.entity.Dzongkhag;

@Repository
public interface DzongkhagRepository extends JpaRepository<Dzongkhag, Integer> {

}
