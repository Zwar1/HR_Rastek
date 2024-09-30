package HR_rastek.demo.Service;

//import HR_rastek.demo.DTO.BasicInfoRequest;
//import HR_rastek.demo.DTO.BasicInfoResponse;
import HR_rastek.demo.DTO.EmployeeRes;
import HR_rastek.demo.DTO.EmployeeReq;
import HR_rastek.demo.Entity.BasicInfoEntity;
import HR_rastek.demo.Entity.EmployeeEntity;
import HR_rastek.demo.Entity.PersonalInfoEntity;
import HR_rastek.demo.Repository.BasicInfoRepository;
import HR_rastek.demo.Repository.EmployeeRepository;
import HR_rastek.demo.Repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ValidationService validationService;

    @Transactional
    public EmployeeRes create(EmployeeReq request){
        validationService.validate(request);

        BasicInfoEntity basicInfo = new BasicInfoEntity();

        basicInfo.setJabatan(request.getJabatan());
        basicInfo.setDivisi(request.getDivisi());
        basicInfo.setDepartement(request.getDepartement());
        basicInfo.setStatusKontrak(request.getStatusKontrak());
        basicInfo.setTanggalMulaiKontrak(request.getTanggalMulaiKontrak());
        basicInfo.setKontrakKedua(request.getKontrakKedua());
        basicInfo.setSalary(request.getSalary());
        basicInfo.setAttachment(request.getAttachment());

        basicInfoRepository.save(basicInfo);

        PersonalInfoEntity personalInfoEntity = new PersonalInfoEntity();

        personalInfoEntity.setName(request.getName());
        personalInfoEntity.setNIP(request.getNIP());
        personalInfoEntity.setNIK(request.getNIK());
        personalInfoEntity.setNPWP(request.getNPWP());
        personalInfoEntity.setKartuKeluarga(request.getKartuKeluarga());
        personalInfoEntity.setJenisKelamin(request.getJenisKelamin());
        personalInfoEntity.setTempatLahir(request.getTempatLahir());
        personalInfoEntity.setAgama(request.getAgama());
        personalInfoEntity.setAlamatLengkap(request.getAlamatLengkap());
        personalInfoEntity.setAlamatDomisili(request.getAlamatDomisili());
        personalInfoEntity.setNoTelp(request.getNoTelp());
        personalInfoEntity.setKontakDarurat(request.getKontakDarurat());
        personalInfoEntity.setNoKontakDarurat(request.getNoKontakDarurat());
        personalInfoEntity.setEmailPribadi(request.getEmailPribadi());
        personalInfoEntity.setPendidikanTerakhir(request.getPendidikanTerakhir());
        personalInfoEntity.setJurusan(request.getJurusan());
        personalInfoEntity.setNamaUniversitas(request.getNamaUniversitas());
        personalInfoEntity.setNamaIbuKandung(request.getNamaIbuKandung());
        personalInfoEntity.setStatusPernikahan(request.getStatusPernikahan());
        personalInfoEntity.setJumlahAnak(request.getJumlahAnak());
        personalInfoEntity.setNomorRekening(request.getNomorRekening());
        personalInfoEntity.setBank(request.getBank());

        personalInfoRepository.save(personalInfoEntity);

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setBasicInfo(basicInfo);
        employeeEntity.setPersonalInfo(personalInfoEntity);

        employeeRepository.save(employeeEntity);

        return EmployeeRes.builder()
                .id(basicInfo.getId())
                .jabatan(basicInfo.getJabatan())
                .divisi(basicInfo.getDivisi())
                .departement(basicInfo.getDepartement())
                .statusKontrak(basicInfo.getStatusKontrak())
                .tanggalMulaiKontrak(basicInfo.getTanggalMulaiKontrak())
                .kontrakKedua(basicInfo.getKontrakKedua())
                .salary(basicInfo.getSalary())
                .attachment(basicInfo.getAttachment())
                .ID(personalInfoEntity.getID())
                .name(personalInfoEntity.getName())
                .NIP(personalInfoEntity.getNIP())
                .NIK(personalInfoEntity.getNIK())
                .NPWP(personalInfoEntity.getNPWP())
                .kartuKeluarga(personalInfoEntity.getKartuKeluarga())
                .jenisKelamin(personalInfoEntity.getJenisKelamin())
                .tempatLahir(personalInfoEntity.getTempatLahir())
                .agama(personalInfoEntity.getAgama())
                .alamatLengkap(personalInfoEntity.getAlamatLengkap())
                .alamatDomisili(personalInfoEntity.getAlamatDomisili())
                .noTelp(personalInfoEntity.getNoTelp())
                .kontakDarurat(personalInfoEntity.getKontakDarurat())
                .noKontakDarurat(personalInfoEntity.getNoKontakDarurat())
                .emailPribadi(personalInfoEntity.getEmailPribadi())
                .pendidikanTerakhir(personalInfoEntity.getPendidikanTerakhir())
                .jurusan(personalInfoEntity.getJurusan())
                .namaUniversitas(personalInfoEntity.getNamaUniversitas())
                .namaIbuKandung(personalInfoEntity.getNamaIbuKandung())
                .statusPernikahan(personalInfoEntity.getStatusPernikahan())
                .jumlahAnak(personalInfoEntity.getJumlahAnak())
                .nomorRekening(personalInfoEntity.getNomorRekening())
                .bank(personalInfoEntity.getBank())
                .build();
    }

}
