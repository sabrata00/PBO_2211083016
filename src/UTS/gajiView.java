/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B;

/**
 *
 * @author LENOVO
 */
public class gajiView extends javax.swing.JFrame {

    private gajiController controller;

    public gajiView() {
        initComponents();
        controller = new gajiController(this);
    }

    public String getGolongan() {
        return txtGolongan.getText();
    }

    public String getTanggal() {
        return txtTanggal.getText();
    }

    public void setGapok(double gapok) {
        txtGapok.setText(String.valueOf(gapok));
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        txtTunjanganAnak.setText(String.valueOf(tunjanganAnak));
    }

    public void setTunjanganIstri(double tunjanganIstri) {
        txtTunjanganIstri.setText(String.valueOf(tunjanganIstri));
    }

    public void setGajiBersih(double gajiBersih) {
        txtGajiBersih.setText(String.valueOf(gajiBersih));
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void initComponents() {
        // ...

        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        // ...
    }

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {
        controller.hitungGaji();
    }

    // ...

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GajiView().setVisible(true);
            }
        });
    }

                       
    private javax.swing.JButton btnHitung;
    private javax.swing.JLabel lblGajiBersih;
    private javax.swing.JLabel lblGapok;
    private javax.swing.JLabel lblGolongan;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTunjanganAnak;
    private javax.swing.JLabel lblTunjanganIstri;
    private javax.swing.JTextField txtGajiBersih;
    private javax.swing.JTextField txtGapok;
    private javax.swing.JTextField txtGolongan;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTunjanganAnak;
    private javax.swing.JTextField txtTunjanganIstri;
                     
}
