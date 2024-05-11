/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.w11;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class model {
    private static CardLayout kartu;
    private static JPanel PanelUtama;
    
    public static void setmodel (CardLayout kartu,JPanel panel){
        model.kartu = kartu;
        model.PanelUtama = panel;
        ganti("Dashboard");
    }
    
    
    public static void tambah(JPanel panel, String kata){
        model.PanelUtama.add(panel,kata);
    }
    
    
    public static void ganti(String target){
        model.kartu.show(model.PanelUtama,target);
    }
}
