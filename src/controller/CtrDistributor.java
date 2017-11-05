/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Distributor;
import model.MySQLCon;

/**
 *
 * @author scorpio
 */
public class CtrDistributor extends Distributor{
    MySQLCon con;
    PreparedStatement stm;
    ResultSet rs;
    
    public DefaultTableModel getSemuaDistributor() {
        try {
            con = new MySQLCon();
            stm = con.connect(
                    "SELECT\n"
                    + "  kd_dist,\n"
                    + "  nama,\n"
                    + "  alamat,\n"
                    + "  telp\n"
                    + "FROM distributor");   //query
            rs = stm.executeQuery();

            DefaultTableModel isiTbl = new DefaultTableModel();
            isiTbl.addColumn("Kode");
            isiTbl.addColumn("Nama");
            isiTbl.addColumn("Alamat");
            isiTbl.addColumn("No Telp");

            Object[] os;
            while (rs.next()) {
                os = new Object[4]; //jumlah kolom yg mau tampil
                os[0] = rs.getString("kd_dist");
                os[1] = rs.getString("nama");
                os[2] = rs.getString("alamat");
                os[3] = rs.getString("telp");
                isiTbl.addRow(os);
            }

            return isiTbl;
        } catch (SQLException ex) {
            Logger.getLogger(CtrDistributor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public DefaultTableModel getCariDistributor(String namaDist) {
        try {
            con = new MySQLCon();
            stm = con.connect(
                    "SELECT\n"
                    + "  kd_dist,\n"
                    + "  nama,\n"
                    + "  alamat,\n"
                    + "  telp\n"
                    + "FROM distributor\n"
                    + "WHERE nama LIKE ?");   //query
            stm.setString(1, "%" + namaDist + "%");
            rs = stm.executeQuery();

            DefaultTableModel isiTbl = new DefaultTableModel();
            isiTbl.addColumn("Kode");
            isiTbl.addColumn("Nama");
            isiTbl.addColumn("Alamat");
            isiTbl.addColumn("No Telp");

            Object[] os;
            while (rs.next()) {
                os = new Object[4]; //jumlah kolom yg mau tampil
                os[0] = rs.getString("kd_dist");
                os[1] = rs.getString("nama");
                os[2] = rs.getString("alamat");
                os[3] = rs.getString("telp");
                isiTbl.addRow(os);
            }

            return isiTbl;
        } catch (SQLException ex) {
            Logger.getLogger(CtrDistributor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void tambah() {
        try {
            con = new MySQLCon();
            stm = con.connect(
                    "INSERT INTO distributor\n"
                    + "            (nama,\n"
                    + "             alamat,\n"
                    + "             telp)\n"
                    + "VALUES (?, ?, ?);");
            stm.setString(1, getNama());
            stm.setString(2, getAlamat());
            stm.setString(3, getTelp());
            stm.executeUpdate();             //insert / delete / update

            JOptionPane.showMessageDialog(null,
                    "Tambah Distributor Berhasil!", "Berhasil",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(CtrDistributor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ubah() {
        try {
            con = new MySQLCon();
            stm = con.connect(
                    "UPDATE distributor\n"
                    + "SET \n"
                    + "  nama = ?,\n"
                    + "  alamat = ?,\n"
                    + "  telp = ?\n"
                    + "WHERE kd_dist = ?;");
            stm.setString(1, getNama());
            stm.setString(2, getAlamat());
            stm.setString(3, getTelp());
            stm.setInt(4, getKode());
            stm.executeUpdate();             //insert / delete / update

            JOptionPane.showMessageDialog(null,
                    "Ubah Distributor Berhasil!", "Berhasil",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(CtrDistributor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hapus() {
        try {
            con = new MySQLCon();
            stm = con.connect(
                    "DELETE\n"
                    + "FROM distributor\n"
                    + "WHERE kd_dist = ?;");
            stm.setInt(1, getKode());
            stm.executeUpdate();             //insert / delete / update

            JOptionPane.showMessageDialog(null,
                    "Hapus Distributor Berhasil!", "Berhasil",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(CtrDistributor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
