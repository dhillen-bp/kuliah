/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class GajiPegawai extends Pegawai {
    
        private ViewGajiPegawai fg;

        public GajiPegawai(ViewGajiPegawai vg) {
            this.fg = vg;
        }

        public void ProsesHitungGaji() {
        super.setNip(fg.getGPNip().getText());
        super.setNama(fg.getGPNama().getText());
        super.setGajiHarian(Double.parseDouble(fg.getGPGajiHarian().getText()));
        super.setMasuk(Double.parseDouble ( fg.getGPMasukKerja().getText()));
        super.setTunjangan(Double.parseDouble(fg.getGPTunjangan().getText()));

        super.setTotalGaji(super.getGajiHarian() * super.getMasuk() + super.getTunjangan());
        super.setPajak((super.getTotalGaji() > 1000000) ? (0.05 * super.getTotalGaji()) : 0);
        super.setGajiBersih(super.getTotalGaji() - super.getPajak());
        
        fg.getHslNip().setText(super.getNip());
        fg.getHslNama().setText(super.getNama());
        fg.getHslPajak().setText(String.valueOf((int)super.getPajak())) ;
        fg.getHslGaji().setText(String.valueOf((int)super.getTotalGaji()));
        fg.getHslGajiBersih().setText(String.valueOf((int)super.getGajiBersih()));

        }

    }
