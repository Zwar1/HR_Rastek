package HR_rastek.demo.Repository;

import HR_rastek.demo.Entity.DivisionEntity;
import HR_rastek.demo.Entity.JabatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JabatanRepository extends JpaRepository<JabatanEntity, Long> {
    Optional<JabatanEntity> findFirstById(Long id);
}
