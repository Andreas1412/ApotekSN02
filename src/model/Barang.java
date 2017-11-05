/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Barang {
    private int kode;
    private String merk;
    private int kodeJenisBarang;
    private int kodeGolongan;
    private int kodeUsia;    
    private int kodeBentuk;
    private int kodeJenisObat;
    private int stok;
    private double hargaJual;
    private String uom;

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    

    public int getKodeJenisBarang() {
        return kodeJenisBarang;
    }

    public void setKodeJenisBarang(int kodeJenisBarang) {
        this.kodeJenisBarang = kodeJenisBarang;
    }

    public int getKodeGolongan() {
        return kodeGolongan;
    }

    public void setKodeGolongan(int kodeGolongan) {
        this.kodeGolongan = kodeGolongan;
    }

    public int getKodeUsia() {
        return kodeUsia;
    }

    public void setKodeUsia(int kodeUsia) {
        this.kodeUsia = kodeUsia;
    }

    public int getKodeBentuk() {
        return kodeBentuk;
    }

    public void setKodeBentuk(int kodeBentuk) {
        this.kodeBentuk = kodeBentuk;
    }

    public int getKodeJenisObat() {
        return kodeJenisObat;
    }

    public void setKodeJenisObat(int kodeJenisObat) {
        this.kodeJenisObat = kodeJenisObat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }
    
}
