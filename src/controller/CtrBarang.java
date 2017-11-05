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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Barang;
import model.MySQLCon;
import model.Parameter;

public class CtrBarang extends Barang {

    Parameter param;

    public CtrBarang() {
        param = new Parameter();
    }

    public Parameter getParam() {
        return param;
    }

    public void setParam(Parameter param) {
        this.param = param;
    }

    public DefaultTableModel getSemuaBarang() {
        try {
            MySQLCon conn = new MySQLCon();
            PreparedStatement stm = conn.connect(
                    "SELECT\n"
                    + "  brg.kd_barang,\n"
                    + "  brg.merk_barang,\n"
                    + "  brg.UOM,\n"
                    + "  jb.nm_jns AS kd_jns,\n"
                    + "  gl.nm_gol kd_gol,\n"
                    + "  us.nm_kel kd_kel,\n"
                    + "  bt.nm_bent kd_bent,\n"
                    + "  jo.nm_jns_obat kd_jns_obat,\n"
                    + "  brg.harga_jual\n"
                    + "FROM daftar_barang AS brg\n"
                    + "LEFT JOIN par_bent AS bt ON brg.kd_bent =bt.kd_bent\n"
                    + "LEFT JOIN par_gol AS gl ON brg.kd_gol =gl.kd_gol\n"
                    + "LEFT JOIN par_jns_brng AS jb ON brg.kd_jns =jb.kd_jns\n"
                    + "LEFT JOIN par_jns_obat AS jo ON brg.kd_jns_obat =jo.kd_jns_obat\n"
                    + "LEFT JOIN par_kel_usia AS us ON brg.kd_kel =us.kd_kel\n"
                    + "order by brg.kd_barang");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel isiTbl = new DefaultTableModel();
            isiTbl.addColumn("Kode");
            isiTbl.addColumn("Merk");
            isiTbl.addColumn("Satuan");
            isiTbl.addColumn("Jenis Barang");
            isiTbl.addColumn("Golongan");
            isiTbl.addColumn("Usia");
            isiTbl.addColumn("Bentuk");
            isiTbl.addColumn("Jenis Obat");
            isiTbl.addColumn("Harga Jual");

            Object[] os;
            while (rs.next()) {
                os = new Object[9];
                os[0] = rs.getInt("kd_barang");
                os[1] = rs.getString("merk_barang");
                os[2] = rs.getString("UOM");
                os[3] = rs.getString("kd_jns");
                os[4] = rs.getString("kd_gol");
                os[5] = rs.getString("kd_kel");
                os[6] = rs.getString("kd_bent");
                os[7] = rs.getString("kd_jns_obat");
                os[8] = rs.getDouble("harga_jual");
                isiTbl.addRow(os);
            }
            return isiTbl;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public DefaultTableModel getCariBarang(String merkBarang) {
        try {
            MySQLCon conn = new MySQLCon();
            PreparedStatement stm = conn.connect(
                    "SELECT\n"
                    + "                     brg.kd_barang,\n"
                    + "                     brg.merk_barang,\n"
                    + "                     brg.UOM,\n"
                    + "                     jb.nm_jns AS kd_jns,\n"
                    + "                     gl.nm_gol kd_gol,\n"
                    + "                     us.nm_kel kd_kel,\n"
                    + "                     bt.nm_bent kd_bent,\n"
                    + "                     jo.nm_jns_obat kd_jns_obat,\n"
                    + "                     brg.harga_jual\n"
                    + "                   FROM daftar_barang AS brg\n"
                    + "                   LEFT JOIN par_bent AS bt ON brg.kd_bent =bt.kd_bent\n"
                    + "                   LEFT JOIN par_gol AS gl ON brg.kd_gol =gl.kd_gol\n"
                    + "                   LEFT JOIN par_jns_brng AS jb ON brg.kd_jns =jb.kd_jns\n"
                    + "                   LEFT JOIN par_jns_obat AS jo ON brg.kd_jns_obat =jo.kd_jns_obat\n"
                    + "                   LEFT JOIN par_kel_usia AS us ON brg.kd_kel =us.kd_kel\n"
                    + "                   WHERE merk_barang LIKE ?\n"
                    + "                   ORDER BY brg.kd_barang");
            stm.setString(1, "%" + merkBarang + "%");
            ResultSet rs = stm.executeQuery();

            DefaultTableModel isiTbl = new DefaultTableModel();
            isiTbl.addColumn("Kode");
            isiTbl.addColumn("Merk");
            isiTbl.addColumn("Satuan");
            isiTbl.addColumn("Jenis Barang");
            isiTbl.addColumn("Golongan");
            isiTbl.addColumn("Usia");
            isiTbl.addColumn("Bentuk");
            isiTbl.addColumn("Jenis Obat");
            isiTbl.addColumn("Harga Jual");

            Object[] os;
            while (rs.next()) {
                os = new Object[9];
                os[0] = rs.getInt("kd_barang");
                os[1] = rs.getString("merk_barang");
                os[2] = rs.getString("UOM");
                os[3] = rs.getString("kd_jns");
                os[4] = rs.getString("kd_gol");
                os[5] = rs.getString("kd_kel");
                os[6] = rs.getString("kd_bent");
                os[7] = rs.getString("kd_jns_obat");
                os[8] = rs.getDouble("harga_jual");
                isiTbl.addRow(os);
            }
            return isiTbl;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ComboBoxModel getSemuaParGolongan() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_gol,\n"
                    + "  nm_gol\n"
                    + "FROM par_gol");
            ResultSet rs = stm.executeQuery();
            DefaultComboBoxModel cmb = new DefaultComboBoxModel();
            Object os;
            while (rs.next()) {
                os = new Object();
                os = rs.getString("nm_gol");
                cmb.addElement(os);
            }
            return cmb;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ComboBoxModel getSemuaUsia() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_kel,\n"
                    + "  nm_kel\n"
                    + "FROM apotek.par_kel_usia");
            ResultSet rs = stm.executeQuery();

            DefaultComboBoxModel cmb = new DefaultComboBoxModel();

            Object os;
            while (rs.next()) {
                os = new Object();
                os = rs.getString("nm_kel");
                cmb.addElement(os);
            }
            return cmb;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ComboBoxModel getSemuaJenisObat() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_jns_obat,\n"
                    + "  nm_jns_obat\n"
                    + "FROM apotek.par_jns_obat");
            ResultSet rs = stm.executeQuery();

            DefaultComboBoxModel cmb = new DefaultComboBoxModel();

            Object os;
            while (rs.next()) {
                os = new Object();
                os = rs.getString("nm_jns_obat");
                cmb.addElement(os);
            }
            return cmb;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public int getParGolongan(String namaGolongan) {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_gol,\n"
                    + "  nm_gol\n"
                    + "FROM apotek.par_gol\n"
                    + "WHERE nm_gol =?;");
            stm.setString(1, namaGolongan);
            ResultSet rs = stm.executeQuery();

            Integer kodeGol = null;
            Object os;
            while (rs.next()) {
                kodeGol = rs.getInt("kd_gol");
            }
            return kodeGol;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getParUsia(String namaUsia) {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_kel,\n"
                    + "  nm_kel\n"
                    + "FROM apotek.par_kel_usia\n"
                    + "WHERE nm_kel = ?;");
            stm.setString(1, namaUsia);
            ResultSet rs = stm.executeQuery();

            Integer kodeKel = null;
            Object os;
            while (rs.next()) {
                kodeKel = rs.getInt("kd_kel");
            }
            return kodeKel;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getParJnsObat(String namaJenis) {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("SELECT\n"
                    + "  kd_jns_obat,\n"
                    + "  nm_jns_obat\n"
                    + "FROM par_jns_obat\n"
                    + "WHERE nm_jns_obat =?;");
            stm.setString(1, namaJenis);
            ResultSet rs = stm.executeQuery();

            Integer kodeJenis = null;
            Object os;
            while (rs.next()) {
                kodeJenis = rs.getInt("kd_jns_obat");
            }
            return kodeJenis;
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void tambahBarang() {
        try {
            MySQLCon con = new MySQLCon();
            PreparedStatement stm = con.connect("INSERT INTO daftar_barang\n"
                    + "            (merk_barang,\n"
                    + "             UOM,\n"
                    + "             kd_jns,\n"
                    + "             kd_gol,\n"
                    + "             kd_kel,\n"
                    + "             kd_bent,\n"
                    + "             kd_jns_obat,\n"
                    + "             harga_jual)\n"
                    + "VALUES (?,?,?,?,?,?,?,?);");
            stm.setString(1, getMerk());
            stm.setString(2, getUom());
            stm.setInt(3, getParam().getKodeJenis());
            stm.setInt(4, getKodeGolongan());
            stm.setInt(5, getKodeUsia());
            stm.setInt(6, getParam().getKodeBentuk());
            stm.setInt(7, getKodeJenisObat());
            stm.setDouble(8, getHargaJual());
            stm.executeUpdate();//insert,update ,delete
            JOptionPane.showMessageDialog(null, "Barang baru berhasil ditambah",
                    "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CtrBarang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
