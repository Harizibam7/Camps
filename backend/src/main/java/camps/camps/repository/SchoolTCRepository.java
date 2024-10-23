package camps.camps.repository;

import camps.camps.model.SchoolTC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolTCRepository extends JpaRepository<SchoolTC, Integer> {
}
