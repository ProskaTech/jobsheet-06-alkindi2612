package jobsheet6;

/**
 *
 * Created by 21343003_Alkindi Syamsi
 */

import javax.swing.JOptionPane;

public class Tugas1b {
    public static void main(String[]args){
        String a ="";
        String b ="";
        String c ="";
        
        a = JOptionPane.showInputDialog("Masukkan Nilai Pertama Anda");
        int pertama = Integer.valueOf(a).intValue();
        b = JOptionPane.showInputDialog("Masukkan Nilai Kedua Anda");
        int kedua = Integer.valueOf(b).intValue();
        c = JOptionPane.showInputDialog("Masukkan Nilai Ketiga Anda");
        int ketiga = Integer.valueOf(c).intValue();
        
        int rata_rata = (pertama + kedua + ketiga)/3;
        
        String hasil ="";
        hasil += "Nilai Pertama: " +pertama+ "\n";
        hasil += "Nilai Kedua: " +kedua+ "\n";
        hasil += "Nilai Ketiga: " +ketiga+ "\n";
        hasil += "Rata-rata Nilai Anda adalah " +rata_rata+ "\n" ;
        
        if (rata_rata <= 60){
            hasil += ":-(";
        }
        else {
            hasil += ":-)";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
