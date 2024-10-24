/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyrapchieuphim2;

/**
 *
 * @author ADMIN
 */
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class QuanLyRapChieuPhim2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLServerException, SQLException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        SQLServerDataSource src = new SQLServerDataSource();
        src.setUser(user);
        src.setPassword(password);
        src.setDatabaseName(db);
        src.setServerName(Server);
        src.setPortNumber(port);
        src.setTrustServerCertificate(true);
        QuanLy ql = new QuanLy();
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        System.setOut(out);
        //ql.Phim(src);
        //ql.LichChieu(src);
        //ql.PhongChieu(src);
        //ql.Ve(src);
        String MovieName = sc.nextLine();
        ql.ThongTinPhim(src, MovieName);
    }
}
