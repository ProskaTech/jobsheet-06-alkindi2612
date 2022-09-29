package jobsheet6;

/**
 *
 * Created by 21343003_Alkindi Syamsi
 */

import javax.swing.JOptionPane;

public class Tugas2a {
    public static void main(String[]args){
        String angka ="";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int a = Integer.valueOf(angka).intValue();
   
        String hasil ="";
        if (a >= 1 && a <= 10){
            hasil += "Valid number";
        }
        else{
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
