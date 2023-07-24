/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;

/**
 *
 * @author LENOVO
 */
public class gajiController {
{

    private gajiView view;

    public gajiController(gajiView view) {
        this.view = view;
    }

    public void hitungGaji() {
        String golongan = view.getGolongan();

        if (golongan.equals("2A")) {
            hitungGajiPokok(100000);
        } else if (golongan.equals("2B")) {
            hitungGajiPokok(200000);
        } else if (golongan.equals("2C")) {
            hitungGajiPokok(300000);
        } else if (golongan.equals("2D")) {
            hitungGajiPokok(400000);
        } else {
            view.showError("Golongan tidak valid");
            return;
        }

        double gajiPokok = Double.parseDouble(view.getGapok());
        double tunjanganAnak = gajiPokok * 0.05;
        double tunjanganIstri = gajiPokok * 0.05;
        double gajiBersih = gajiPokok + tunjanganAnak + tunjanganIstri;

        view.setTunjanganAnak(tunjanganAnak);
        view.setTunjanganIstri(tunjanganIstri);
        view.setGajiBersih(gajiBersih);
    }

    private void hitungGajiPokok(double gapok) {
        view.setGapok(gapok);
    }
}
