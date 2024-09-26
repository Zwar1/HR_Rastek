package HR_rastek.demo.Controller;


import HR_rastek.demo.DTO.EmployeeDTO;
import HR_rastek.demo.Service.EmployeeService;
import HR_rastek.demo.Entity.BasicInfoEntity;
import HR_rastek.demo.Entity.PersonalInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add")
    public PersonalInfoEntity addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        BasicInfoEntity basicInfo = new BasicInfoEntity();
        basicInfo.setJabatan(employeeDTO.getJabatan());
        basicInfo.setDivisi(employeeDTO.getDivisi());
        basicInfo.setDepartement(employeeDTO.getDepartemen());
        basicInfo.setStatusKontrak(employeeDTO.getStatusKontrak());
        basicInfo.setTanggalMulaiKontrak(employeeDTO.getTanggalMulaiKontrak());
        basicInfo.setKontrakKedua(employeeDTO.getKontrakKedua());
        basicInfo.setSalary(employeeDTO.getSalary());
        basicInfo.setAttachment(employeeDTO.getAttachment());

        PersonalInfoEntity personalInfo = new PersonalInfoEntity();
        personalInfo.setName(employeeDTO.getName());
        personalInfo.setNIP(employeeDTO.getNIP());
        personalInfo.setNIK(employeeDTO.getNIK());
        personalInfo.setNPWP(employeeDTO.getNPWP());
        personalInfo.setKartuKeluarga(employeeDTO.getKartuKeluarga());
        personalInfo.setJenisKelamin(employeeDTO.getJenisKelamin());
        personalInfo.setTempatLahir(employeeDTO.getTempatLahir());
        personalInfo.setAgama(employeeDTO.getAgama());
        personalInfo.setAlamatLengkap(employeeDTO.getAlamatLengkap());
        personalInfo.setAlamatDomisili(employeeDTO.getAlamatDomisili());
        personalInfo.setNoTelp(employeeDTO.getNoTelp());
        personalInfo.setKontakDarurat(employeeDTO.getKontakDarurat());
        personalInfo.setNoKontakDarurat(employeeDTO.getNoKontakDarurat());
        personalInfo.setEmailPribadi(employeeDTO.getEmailPribadi());
        personalInfo.setPendidikanTerakhir(employeeDTO.getPendidikanTerakhir());
        personalInfo.setJurusan(employeeDTO.getJurusan());
        personalInfo.setNamaUniversitas(employeeDTO.getNamaUniversitas());
        personalInfo.setNamaIbuKandung(employeeDTO.getNamaIbuKandung());
        personalInfo.setStatusPernikahan(employeeDTO.getStatusPernikahan());
        personalInfo.setJumlahAnak(employeeDTO.getJumlahAnak());
        personalInfo.setNomorRekening(employeeDTO.getNomorRekening());
        personalInfo.setBank(employeeDTO.getBank());

        System.out.println("Saving employee: " + employeeDTO.getName());
        return employeeService.addEmployee(basicInfo, personalInfo);

    }
}



class EmployeeRequest {
    // Fields for both BasicInfo and PersonalInfo
    private String name;
    private String NIP;
    private String NIK;
    private String NPWP;
    private String kartuKeluarga;
    private String jenisKelamin;
    private String tempatLahir;
    private String agama;
    private String alamatLengkap;
    private String alamatDomisili;
    private String noTelp;
    private String kontakDarurat;
    private String noKontakDarurat;
    private String emailPribadi;
    private String pendidikanTerakhir;
    private String jurusan;
    private String namaUniversitas;
    private String namaIbuKandung;
    private String statusPernikahan;
    private String jumlahAnak;
    private String nomorRekening;
    private String bank;
    private String jabatan;
    private String divisi;
    private String departement;
    private String statusKontrak;
    private String tanggalMulaiKontrak;
    private String kontrakKedua;
    private BigDecimal salary;
    private String attachment;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNomorIndukPegawai(String NIP) {
        this.NIP = NIP;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public String getKartuKeluarga() {
        return kartuKeluarga;
    }

    public void setKartuKeluarga(String kartuKeluarga) {
        this.kartuKeluarga = kartuKeluarga;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public String getAlamatDomisili() {
        return alamatDomisili;
    }

    public void setAlamatDomisili(String alamatDomisili) {
        this.alamatDomisili = alamatDomisili;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getKontakDarurat() {
        return kontakDarurat;
    }

    public void setKontakDarurat(String kontakDarurat) {
        this.kontakDarurat = kontakDarurat;
    }

    public String getNoKontakDarurat() {
        return noKontakDarurat;
    }

    public void setNoKontakDarurat(String noKontakDarurat) {
        this.noKontakDarurat = noKontakDarurat;
    }

    public String getEmailPribadi() {
        return emailPribadi;
    }

    public void setEmailPribadi(String emailPribadi) {
        this.emailPribadi = emailPribadi;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNamaUniversitas() {
        return namaUniversitas;
    }

    public void setNamaUniversitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }

    public String getNamaIbuKandung() {
        return namaIbuKandung;
    }

    public void setNamaIbuKandung(String namaIbuKandung) {
        this.namaIbuKandung = namaIbuKandung;
    }

    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(String statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    public String getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(String jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getStatusKontrak() {
        return statusKontrak;
    }

    public void setStatusKontrak(String statusKontrak) {
        this.statusKontrak = statusKontrak;
    }

    public String getTanggalMulaiKontrak() {
        return tanggalMulaiKontrak;
    }

    public void setTanggalMulaiKontrak(String tanggalMulaiKontrak) {
        this.tanggalMulaiKontrak = tanggalMulaiKontrak;
    }

    public String getKontrakKedua() {
        return kontrakKedua;
    }

    public void setKontrakKedua(String kontrakKedua) {
        this.kontrakKedua = kontrakKedua;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

}
