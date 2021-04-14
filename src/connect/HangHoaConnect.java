/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//làm việc trực tiếp với csdl
package connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.HangHoa;
/**
 *
 * @author Asus
 */
public class HangHoaConnect {
    static connect con= new connect();
    public List<HangHoa> getAllHangHoa(){
        List<HangHoa> hhs = new ArrayList<>();//tao list moi
        Connection cn =  con.getConnecDB();
        String sql ="select * from HangHoa";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                HangHoa hh = new HangHoa();//tao doi tuong moi cua class user
                hh.setMaHang(rs.getString("maHang"));
                hh.setTenMatHang(rs.getString("tenMatHang"));
                hh.setNamSanXuat(rs.getString("namSanXuat"));
                hh.setDonGian(rs.getString("donGia"));
                hh.setSoLuong(rs.getString("soLuong"));
                hhs.add(hh);//thêm us vào list users
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hhs;//tra ve list
    }
    
    
    public static HangHoa getHangHoa(String maHang){
        
        Connection cn =  con.getConnecDB();
        String sql ="select * from HangHoa where tenMatHang like '%?%'";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, maHang);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                HangHoa hh = new HangHoa();//tao doi tuong moi cua class user
                hh.setMaHang(rs.getString("maHang"));
                hh.setTenMatHang(rs.getString("tenMatHang"));
                hh.setNamSanXuat(rs.getString("namSanXuat"));
                hh.setDonGian(rs.getString("donGia"));
                hh.setSoLuong(rs.getString("soLuong"));
                return hh;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;//tra ve list
    }
    public static void insert(HangHoa sv){
        Connection cn = con.getConnecDB();
        String sql="insert into HangHoa values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, sv.getMaHang());
            pstm.setString(2, sv.getTenMatHang());
            pstm.setString(3, sv.getNamSanXuat());
            pstm.setString(4, sv.getDonGian());
            pstm.setString(5, sv.getSoLuong());
            int rs=pstm.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void update(HangHoa sv){
        Connection cn = con.getConnecDB();
        String sql="update HangHoa set tenMatHang = ?, namSanXuat = ?, donGia = ?, soLuong =? where maHang = ?";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, sv.getTenMatHang());
            pstm.setString(2, sv.getNamSanXuat());
            pstm.setString(3, sv.getDonGian());
            pstm.setString(4, sv.getSoLuong());
            pstm.setString(5, sv.getMaHang());

            int rs = pstm.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void delete(String maHang){
        Connection cn = con.getConnecDB();
        String sql = "delete from HangHoa where maHang = ?";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, maHang);
            int rs = pstm.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
    
    
}
