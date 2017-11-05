/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.Karyawan;

import model.MySQLCon;

/**
 *
 * @author iikhi
 */
public class CtrKaryawan extends Karyawan {

    public DefaultTableModel getSemuaKaryawan() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("select\n"
                    + "  kd_karyawan,\n"
                    + "  username,\n"
                    + "  PASSWORD,\n"
                    + "  nama,\n"
                    + "  jabatan\n"
                    + "from  karyawan");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlKaryawan = new DefaultTableModel();
            mdlKaryawan.addColumn("Kode Karyawan");
            mdlKaryawan.addColumn("Pengguna");
            mdlKaryawan.addColumn("Password");
            mdlKaryawan.addColumn("Nama");
            mdlKaryawan.addColumn("Jabatan");

            Object[] os;
            while (rs.next()) {
                os = new Object[5];
                os[0] = rs.getInt("kd_karyawan");
                os[1] = rs.getString("username");
                os[2] = rs.getString("PASSWORD");
                os[3] = rs.getString("nama");
                os[4] = rs.getString("jabatan");
                mdlKaryawan.addRow(os);
            }
            return mdlKaryawan;
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultTableModel getCariKaryawan(String uname) {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("select\n"
                    + "  kd_karyawan,\n"
                    + "  username,\n"
                    + "  PASSWORD,\n"
                    + "  nama,\n"
                    + "  jabatan\n"
                    + "from  karyawan\n"
                    + "where username like  ? ;");
            stm.setString(1, "%" + uname + "%");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel mdlKaryawan = new DefaultTableModel();
            mdlKaryawan.addColumn("Kode Karyawan");
            mdlKaryawan.addColumn("Pengguna");
            mdlKaryawan.addColumn("Password");
            mdlKaryawan.addColumn("Nama");
            mdlKaryawan.addColumn("Jabatan");

            Object[] os;
            while (rs.next()) {
                os = new Object[5];
                os[0] = rs.getInt("kd_karyawan");
                os[1] = rs.getString("username");
                os[2] = rs.getString("PASSWORD");
                os[3] = rs.getString("nama");
                os[4] = rs.getString("jabatan");
                mdlKaryawan.addRow(os);
            }
            return mdlKaryawan;
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void tambahKaryawan() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("INSERT INTO karyawan\n"
                    + "            (username,\n"
                    + "             PASSWORD,\n"
                    + "             nama,\n"
                    + "             jabatan)\n"
                    + "VALUES (?,?,?,?);");
            stm.setString(1, getUsername());
            stm.setString(2, getPassword());
            stm.setString(3, getNama());
            stm.setString(4, getJabatan());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Karyawan baru berhasil ditambahkan",
                    "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hapusKaryawan() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("DELETE\n"
                    + "FROM  karyawan\n"
                    + "WHERE kd_karyawan = ?;");
            stm.setInt(1, getKdKaryawan());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di hapus",
                    "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ubahKaryawan() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("UPDATE karyawan\n"
                    + "SET username = ?,\n"
                    + "  PASSWORD = ?,\n"
                    + "  nama = ?,\n"
                    + "  jabatan = ?\n"
                    + "WHERE kd_karyawan = ?;");
            stm.setString(1, getUsername());
            stm.setString(2, getPassword());
            stm.setString(3, getNama());
            stm.setString(4, getJabatan());
            stm.setInt(5, getKdKaryawan());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di Ubah",
                    "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public String checkLogin() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_karyawan,\n"
                    + "  username,\n"
                    + "  PASSWORD,\n"
                    + "  nama,\n"
                    + "  jabatan\n"
                    + "FROM karyawan\n"
                    + "WHERE username =? AND PASSWORD = ?;");
            stm.setString(1, getUsername());
            stm.setString(2, getPassword());
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                return "Sukses";
            } else {
                return "gagal";

            }

        } catch (SQLException ex) {
            Logger.getLogger(CtrKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
}
}




        

        
