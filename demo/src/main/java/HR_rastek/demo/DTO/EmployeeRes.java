package HR_rastek.demo.DTO;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmployeeRes {
    // Personal Information fields
    private Long id_p;
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
    private Long id_b;
    private String jabatan;
    private String divisi;
    private String subDivisi;
    private String departement;
    private String statusKontrak;
    private String tanggalMulaiKontrak;
    private String kontrakKedua;
    private BigDecimal salary;
    private String attachment;

    // Employee Fields
    private Long id;



}
