package HR_rastek.demo.Repository;

import HR_rastek.demo.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    //Optional<EmployeeEntity> findFirstByIdE(Long id);

}
