/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
//chứa các hàm xử lí dữ liệu
//không làm việc trực tiếp với csdl
//làm việc thông qua lớp HangHoaConnect
import connect.HangHoaConnect;
import java.util.List;
import Model.HangHoa;


/**
 *
 * @author Asus
 */
public class HangHoaService {
    private final HangHoaConnect HangHoaCn;
    public HangHoaService(){
        HangHoaCn = new HangHoaConnect();
    }
    public List<HangHoa> getALLHangHoa(){
        return HangHoaCn.getAllHangHoa();//trả về dữ liệu
    }
    
    public HangHoa getHangHoa(String maHang){
        return HangHoaConnect.getHangHoa(maHang);
    }
    public void insert(HangHoa hh){
        HangHoaConnect.insert(hh);
    }
    public void delete(String maHang){
        HangHoaConnect.delete(maHang);
    }
   
    public void update(HangHoa hh){
        HangHoaConnect.update(hh);
    }
    
    
}

