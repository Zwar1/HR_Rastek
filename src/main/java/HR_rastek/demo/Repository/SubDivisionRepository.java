package HR_rastek.demo.Repository;

import HR_rastek.demo.Entity.DivisionEntity;
import HR_rastek.demo.Entity.SubDivisionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubDivisionRepository extends JpaRepository<SubDivisionEntity, Long> {
    Optional<SubDivisionEntity> findFirstById(Long id);
}
