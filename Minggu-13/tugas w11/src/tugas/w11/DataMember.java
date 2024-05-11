/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tugas.w11;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DataMember extends javax.swing.JPanel {

    /**
     * Creates new form DataMember
     */
    public DataMember() {
        initComponents();
        updatetabel();
    }

    private static DefaultTableModel settable(ResultSet rs) throws SQLException {

        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();

        //names of columns
        Vector<String> columnnames = new Vector<String>();
        int columncount = rsmd.getColumnCount();
        for (int column = 1; column <= columncount; column++) {
            columnnames.add(rsmd.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int ci = 1; ci <= columncount; ci++) {
                vector.add(rs.getObject(ci));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnnames);
    }

    private void updatetabel() {
        try {
            Tabel1.setModel(settable(dbs.getConnection().createStatement().executeQuery("select no,kd_member as `Kode Member`,nama as Nama,no_tlp as `No Tlp`,alamat as Alamat from data_member")));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        tlp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255)), "Input Data Member", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Member");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Tlp");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_edit.setText("EDIT");

        btn_clear.setText("CLEAR");

        btn_delete.setText("DELETE");

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tlp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alamat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40))
                            .addComponent(alamat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_save)
                            .addComponent(btn_edit)
                            .addComponent(btn_clear)
                            .addComponent(btn_delete))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            PreparedStatement pst = dbs.getConnection().prepareStatement("insert into data_member(kd_member,nama,no_tlp,alamat) values (?,?,?,?)");
            pst.setString(1, kode.getText());
            pst.setString(2, nama.getText());
            pst.setString(3, tlp.getText());
            pst.setString(4, alamat.getText());
            
            pst.executeUpdate();
            clear();
            updatetabel();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void clear() {
        nama.setText("");
        tlp.setText("");
        alamat.setText("");
        kode.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel1;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField tlp;
    // End of variables declaration//GEN-END:variables
}
