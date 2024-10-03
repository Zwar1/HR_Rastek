package HR_rastek.demo.Repository;
import HR_rastek.demo.Entity.BasicInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasicInfoRepository extends JpaRepository<BasicInfoEntity, Long> {


}
