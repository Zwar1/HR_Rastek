package HR_rastek.demo.DTO;

import java.math.BigDecimal;

public class EmployeeDTO {
    // Personal Information fields
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


    // Basic Information fields
    private String jabatan;
    private String divisi;
    private String departemen;
    private String statusKontrak;
    private String tanggalMulaiKontrak;
    private String kontrakKedua;
    private BigDecimal salary;
    private String attachment;


    // Getter, Setter, Constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
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

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getAlamatDomisili() {
        return alamatDomisili;
    }

    public void setAlamatDomisili(String alamatDomisili) {
        this.alamatDomisili = alamatDomisili;
    }

    public String getNoKontakDarurat() {
        return noKontakDarurat;
    }

    public void setNoKontakDarurat(String noKontakDarurat) {
        this.noKontakDarurat = noKontakDarurat;
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

    public String getEmailPribadi() {
        return emailPribadi;
    }

    public void setEmailPribadi(String emailPribadi) {
        this.emailPribadi = emailPribadi;
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

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
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

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
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

    public EmployeeDTO(String name, String NIP, String NIK, String NPWP, String kartuKeluarga, String jenisKelamin, String tempatLahir, String agama, String alamatLengkap, String alamatDomisili, String noTelp, String kontakDarurat, String noKontakDarurat, String emailPribadi, String pendidikanTerakhir, String jurusan, String namaUniversitas, String namaIbuKandung, String statusPernikahan, String jumlahAnak, String nomorRekening, String bank, String jabatan, String divisi, String departemen, String statusKontrak, String tanggalMulaiKontrak, String kontrakKedua, BigDecimal salary, String attachment) {
        this.name = name;
        this.NIP = NIP;
        this.NIK = NIK;
        this.NPWP = NPWP;
        this.kartuKeluarga = kartuKeluarga;
        this.jenisKelamin = jenisKelamin;
        this.tempatLahir = tempatLahir;
        this.agama = agama;
        this.alamatLengkap = alamatLengkap;
        this.alamatDomisili = alamatDomisili;
        this.noTelp = noTelp;
        this.kontakDarurat = kontakDarurat;
        this.noKontakDarurat = noKontakDarurat;
        this.emailPribadi = emailPribadi;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.jurusan = jurusan;
        this.namaUniversitas = namaUniversitas;
        this.namaIbuKandung = namaIbuKandung;
        this.statusPernikahan = statusPernikahan;
        this.jumlahAnak = jumlahAnak;
        this.nomorRekening = nomorRekening;
        this.bank = bank;
        this.jabatan = jabatan;
        this.divisi = divisi;
        this.departemen = departemen;
        this.statusKontrak = statusKontrak;
        this.tanggalMulaiKontrak = tanggalMulaiKontrak;
        this.kontrakKedua = kontrakKedua;
        this.salary = salary;
        this.attachment = attachment;
    }
}
