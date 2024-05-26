/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlphimvaxuatchieu;

/**
 *
 * @author ADMIN
 */
public class Phim {
     private int maPhim;
    private String tenPhim;
    private String daoDien;
    private int namSanXuat;
    private String suatChieu;
    private String moTa;
    private String ngayKhoiChieu;
    private String ngayKetThuc;


    public Phim() {
    }

    public Phim(int maPhim, String tenPhim, String daoDien, int namSanXuat, String suatChieu, String moTa, String ngayKhoiChieu, String ngayKetThuc) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.daoDien = daoDien;
        this.namSanXuat = namSanXuat;
        this.suatChieu = suatChieu;
        this.moTa = moTa;
        this.ngayKhoiChieu = ngayKhoiChieu;
        this.ngayKetThuc = ngayKetThuc;

    }

    public int getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(int maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getSuatChieu() {
        return suatChieu;
    }

    public void setSuatChieu(String suatChieu) {
        this.suatChieu = suatChieu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayKhoiChieu() {
        return ngayKhoiChieu;
    }

    public void setNgayKhoiChieu(String ngayKhoiChieu) {
        this.ngayKhoiChieu = ngayKhoiChieu;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "Phim{" + "maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", daoDien=" + daoDien + ", namSanXuat=" + namSanXuat + ", suatChieu=" + suatChieu + ", moTa=" + moTa + ", ngayKhoiChieu=" + ngayKhoiChieu + ", ngayKetThuc=" + ngayKetThuc + '}';
    }

   

   
}
