package HR_rastek.demo.Repository;


import HR_rastek.demo.Entity.PersonalInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfoEntity, Long> {

}
