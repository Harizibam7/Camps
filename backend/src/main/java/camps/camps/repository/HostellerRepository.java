package camps.camps.repository;

import camps.camps.model.Hosteller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostellerRepository extends JpaRepository<Hosteller, Integer> {
}
