/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyrapchieuphim2;

/**
 *
 * @author ADMIN
 */
public class QuanLyPhongChieu {
    private String soPhong, TinhTrang;

    public QuanLyPhongChieu(String soPhong, String TinhTrang) {
        this.soPhong = soPhong;
        this.TinhTrang = TinhTrang;
    }
    public String setSoPhong(){
        return soPhong;
    }
    public String setTinhTrang(){
        return TinhTrang;
    }
}
