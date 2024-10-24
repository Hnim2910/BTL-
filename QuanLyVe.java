/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyrapchieuphim2;

/**
 *
 * @author ADMIN
 */
public class QuanLyVe {
    private String MovieName, TinhTrangMoBan, TinhTrangVeTaiQuay, TinhTrangVeTrucTuyen;
    private int SoLuongMoBan, ConLai, GiaVe;

    public QuanLyVe(String MovieName, String TinhTrangMoBan, int SoLuongMoBan, int ConLai, int GiaVe, String TinhTrangVeTaiQuay, String TinhTrangVeTrucTuyen) {
        this.MovieName = MovieName;
        this.TinhTrangMoBan = TinhTrangMoBan;
        this.TinhTrangVeTaiQuay = TinhTrangVeTaiQuay;
        this.TinhTrangVeTrucTuyen = TinhTrangVeTrucTuyen;
        this.SoLuongMoBan = SoLuongMoBan;
        this.ConLai = ConLai;
        this.GiaVe = GiaVe;
    }
    public String setMovieName(){
        return MovieName;
    }
    public String setTinhTrangMoBan(){
        return TinhTrangMoBan;
    }
    public int SetSoLuongMoBan(){
        return SoLuongMoBan;
    }
    public int SetConLai(){
        return ConLai;
    }
    public int SetGiaVe(){
        return GiaVe;
    }
    public String SetTinhTrangVeTaiQuay(){
        return TinhTrangVeTaiQuay;
    }
    public String SetTinhTrangVeTrucTuyen(){
        return TinhTrangVeTrucTuyen;
    }
    public int DoanhThuPhim(){
        return GiaVe*(SoLuongMoBan-ConLai);
    }
}
