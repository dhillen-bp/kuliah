/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Pegawai {
    
    private String nip, nama;
    private double gajiHarian, tunjangan,
        masuk, TotalGaji, Pajak, gajiBersih;

        public String getNip() {
            return nip;
        }

        public void setNip (String nip) {
            this.nip = nip;
        }

        public String getNama() {
            return nama;
        }

        public void setNama (String nama) {
            this.nama = nama;
        }

        public double getGajiHarian() {
            return gajiHarian;
        }

        public void setGajiHarian (double gajiHarian) {
            this.gajiHarian = gajiHarian;
        }

        public double getTunjangan( ) {
            return tunjangan;
        }

        public void setTunjangan (double tunjangan) {
            this.tunjangan = tunjangan ;
        }

        public double getMasuk() {
            return masuk;
        }

        public void setMasuk (double masuk) {
            this.masuk = masuk;
        }

        public double getTotalGaji ( ) {
            return TotalGaji;
        }

        public void setTotalGaji (double TotalGaji) {
            this.TotalGaji = TotalGaji;
        }

        public double getPajak() {
            return Pajak;
        }

        public void setPajak (double Pajak) {
            this.Pajak = Pajak;
        }

        public double getGajiBersih ( ) {
            return gajiBersih;
        }

        public void setGajiBersih (double gajiBersih) {
            this.gajiBersih = gajiBersih;
        }
        
        // Dosen
        private String nidn, namaDosen, jabatanStruktural, jabatanFungsional, golongan;
        private Integer sks, gajiGolongan, gajiStruktural, gajiFungsional, gajiMengajar, gajiTotal;

        public String getNidn() {
            return nidn;
        }

        public String getNamaDosen() {
            return namaDosen;
        }

        public void setNamaDosen(String namaDosen) {
            this.namaDosen = namaDosen;
        }

        public void setNidn(String nidn) {
            this.nidn = nidn;
        }

        public String getJabatanStruktural() {
            return jabatanStruktural;
        }

        public void setJabatanStruktural(String jabatanStruktural) {
            this.jabatanStruktural = jabatanStruktural;
        }

        public String getJabatanFungsional() {
            return jabatanFungsional;
        }

        public void setJabatanFungsional(String jabatanFungsional) {
            this.jabatanFungsional = jabatanFungsional;
        }

        public String getGolongan() {
            return golongan;
        }

        public void setGolongan(String golongan) {
            this.golongan = golongan;
        }

        public Integer getSks() {
            return sks;
        }

        public void setSks(Integer sks) {
            this.sks = sks;
        }

        public Integer getGajiStruktural() {
            return gajiStruktural;
        }

        public void setGajiStruktural(Integer gajiStruktural) {
            this.gajiStruktural = gajiStruktural;
        }

        public Integer getGajiFungsional() {
            return gajiFungsional;
        }

        public void setGajiFungsional(Integer gajiFungsional) {
            this.gajiFungsional = gajiFungsional;
        }

        public Integer getGajiMengajar() {
            return gajiMengajar;
        }

        public void setGajiMengajar(Integer gajiMengajar) {
            this.gajiMengajar = gajiMengajar;
        }

        public Integer getGajiTotal() {
            return gajiTotal;
        }

        public void setGajiTotal(Integer gajiTotal) {
            this.gajiTotal = gajiTotal;
        }

        public Integer getGajiGolongan() {
            return gajiGolongan;
        }

        public void setGajiGolongan(Integer gajiGolongan) {
            this.gajiGolongan = gajiGolongan;
        }
        
}
