/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class GajiDosen extends Pegawai implements GajiDosenInter{
    
    private String nidn, jabatanFungsional;
    private Integer sks, tunjanganFungsional;
    
    private ViewGajiDosen fg;

    public GajiDosen(ViewGajiDosen vg) {
       this.fg = vg;
    }
        
    public void HitungGajiDosen() {
        
        super.setNidn(fg.getfNIDN().getText());
        super.setNamaDosen(fg.getfNamaDosen().getText());
        super.setSks(Integer.parseInt(fg.getfTotSKS().getText()));
        super.setGolongan(fg.getfGolongan().getSelectedItem().toString());
        super.setJabatanStruktural(fg.getfJabStrukur().getSelectedItem().toString());
        super.setJabatanFungsional(fg.getfJabFungs().getSelectedItem().toString());

        super.setGajiGolongan(super.getGajiGolongan());
        super.setGajiStruktural(super.getGajiStruktural());
        super.setGajiFungsional(super.getGajiFungsional());
        super.setGajiMengajar(super.getGajiMengajar());
        super.setGajiTotal(super.getGajiTotal());

        fg.getHslNIDN().setText(super.getNidn());
        fg.getHslNamaDosen().setText(super.getNamaDosen());
        fg.getHslGajiGolongan().setText(String.valueOf((int)gajiGolongan()));
        fg.getHslGajiStruktural().setText(String.valueOf((int)gajiStruktural()));
        fg.getHslGajiFungsional().setText(String.valueOf((int)gajiFungsional()));
        fg.getHslGajiMengajar().setText(String.valueOf((int)mengajar()));
        fg.getHslTotGaji().setText(String.valueOf((int)TotalGajiDosen()));
    }


    @Override
    public double gajiGolongan() {
        if(getGolongan().equals("IIIA")) {
            return 2000000;
        }else if(getGolongan().equals("IIIB")){
            return 2500000;
        }else if(getGolongan().equals("IIIC")) {
            return 3000000;
        }
        return 0;
    }

    @Override
    public double gajiStruktural() {
        if(getJabatanStruktural().equals("Rector")) {
            return 7000000;
        }else if(getJabatanStruktural().equals("Dekan")){
            return 5000000;
        }else if(getJabatanStruktural().equals("Kaprodi")) {
            return 3000000;
        }
        return 0;
    }

    @Override
    public double gajiFungsional() {
        if(getJabatanFungsional().equals("Lector Kepala")) {
            return 1000000;
        }else if(getJabatanFungsional().equals("Lector")){
            return 700000;
        }else if(getJabatanFungsional().equals("Asisten Ahli")) {
            return 500000;
        }
        return 0;
    }

    @Override
    public double TotalGajiDosen() {
        return gajiGolongan()+gajiStruktural()+gajiFungsional()+mengajar();
    }

    @Override
    public double mengajar() {
        return getSks() * 50000;
    }
    
}
