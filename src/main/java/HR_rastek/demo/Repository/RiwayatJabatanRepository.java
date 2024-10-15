package HR_rastek.demo.Repository;
import HR_rastek.demo.Entity.RiwayatJabatanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RiwayatJabatanRepository extends JpaRepository<RiwayatJabatanEntity, Long> {

}
