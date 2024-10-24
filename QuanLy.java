/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyrapchieuphim2;

/**
 *
 * @author ADMIN
 */
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
public class QuanLy  {
    public void LichChieu(SQLServerDataSource src) throws SQLServerException, SQLException{
        Connection cn = src.getConnection();
        String s = "Select * from [dbo].[QuanLyLichChieu]";
        Statement st = cn.createStatement();
        ResultSet re = st.executeQuery(s);
        while(re.next()){
            String MN = re.getString("MovieName");
            String GC = re.getString("GioChieu");
            int PC = re.getInt("PhongChieu");
            String NC = re.getString("NgayChieu");
            QuanLyLichChieu qllc = new QuanLyLichChieu(MN,GC,PC,NC);
            System.out.println(qllc.setMovieName()+" "+qllc.setGioChieu()+" "+qllc.setPhongChieu()+" "+qllc.setNgayChieu());
        }
        re.close();
        st.close();
        cn.close();
    }
    public void Phim(SQLServerDataSource src) throws SQLServerException, SQLException{
        Connection cn = src.getConnection();
        String s = "Select * from [dbo].[QuanLyPhim]";
        Statement st = cn.createStatement();
        ResultSet re = st.executeQuery(s);
        while(re.next()){
            String MN = re.getString("MovieName");
            String Gen = re.getString("Genre");
            String Dir = re.getString("Directors");
            String AAc = re.getString("ActorsAndActresses");
            QuanLyPhim qlp = new QuanLyPhim(MN,Gen,Dir,AAc);
            System.out.println(qlp.setMovieName()+" "+qlp.setGenre()+" "+qlp.setDirectors()+" "+qlp.setActorsAndActresses());
        }
        re.close();
        st.close();
        cn.close();
    }
    public void PhongChieu(SQLServerDataSource src) throws SQLServerException, SQLException{
        Connection cn = src.getConnection();
        String s = "Select * from [dbo].[QuanLyPhongChieu]";
        Statement st = cn.createStatement();
        ResultSet re = st.executeQuery(s);
        while(re.next()){
            String SP = re.getString("soPhong");
            String TT = re.getString("TinhTrang");
            QuanLyPhongChieu qlpc = new QuanLyPhongChieu(SP,TT);
            System.out.println(qlpc.setSoPhong()+" "+qlpc.setTinhTrang());
        }
        re.close();
        st.close();
        cn.close();
    }
    public void Ve(SQLServerDataSource src) throws SQLServerException, SQLException{
        Connection cn = src.getConnection();
        String s = "Select * from [dbo].[QuanLyVe]";
        Statement st = cn.createStatement();
        ResultSet re = st.executeQuery(s);
        while(re.next()){
            String MN = re.getString("MovieName");
            String TTMB = re.getString("TinhTrangMoBan");
            int SLMB = re.getInt("SoLuongMoBan");
            int Cl = re.getInt("ConLai");
            int GV = re.getInt("GiaVe");
            String TTVTQ = re.getString("TinhTrangVeTaiQuay");
            String TTVTT = re.getString("TinhTrangVeTrucTuyen");
            QuanLyVe qlv = new QuanLyVe(MN,TTMB,SLMB,Cl,GV,TTVTQ,TTVTT);
            System.out.println(qlv.setMovieName()+" "+qlv.SetSoLuongMoBan()+" "+qlv.SetConLai()+" "+qlv.SetGiaVe()+" "+qlv.SetTinhTrangVeTaiQuay()+" "+qlv.SetTinhTrangVeTrucTuyen());
            System.out.println(qlv.DoanhThuPhim());
        }
        re.close();
        st.close();
        cn.close();
    }
    public void ThongTinPhim(SQLServerDataSource src, String MovieName) throws SQLServerException, SQLException{
        Connection cn = src.getConnection();
        String s = "Select * from ([dbo].[QuanLyLichChieu] inner join [dbo].[QuanLyPhim] on QuanLyLichChieu.MovieName = QuanLyPhim.MovieName) join [dbo].[QuanLyVe] on QuanLyVe.MovieName = QuanLyLichChieu.MovieName";
        Statement st = cn.createStatement();
        ResultSet re = st.executeQuery(s);
        while(re.next()){
            String MN = re.getString("MovieName");
            String Gen = re.getString("Genre");
            String Dir = re.getString("Directors");
            String AAc = re.getString("ActorsAndActresses");
            String GC = re.getString("GioChieu");
            int PC = re.getInt("PhongChieu");
            String NC = re.getString("NgayChieu");
            String TTMB = re.getString("TinhTrangMoBan");
            int SLMB = re.getInt("SoLuongMoBan");
            int Cl = re.getInt("ConLai");
            int GV = re.getInt("GiaVe");
            String TTVTQ = re.getString("TinhTrangVeTaiQuay");
            String TTVTT = re.getString("TinhTrangVeTrucTuyen");
            if(re.getString("MovieName").equals(MovieName)){
                System.out.println(MN+" "+Gen+" "+Dir+" "+AAc+" "+GC+" "+PC+" "+NC+" "+TTMB+" "+SLMB+" "+Cl+" "+GV+" "+TTVTQ+" "+TTVTT);
                break;
            }
        }
        re.close();
        st.close();
        cn.close();
    }
}
