/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.dao;

import MVC.helper.Koneksi;
import MVC.model.MahasiswaModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class MahasiswaDaoImplement implements MahasiswaDao{
    List<MahasiswaModel> data= new ArrayList<>();

    @Override
    public void save(MahasiswaModel mahasiswa) throws Exception{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Koneksi k = new Koneksi();
        Connection conn = k.getKoneksi();
        String sql = "INSERT INTO mahasiswas (nobp,nama,gender) VALUES (?,?,?)";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,mahasiswa.getNobp());
        ps.setString(2,mahasiswa.getNama());
        ps.setString(3,mahasiswa.getGender());
        ps.execute();
    }

    @Override
    public void update(MahasiswaModel mahasiswa) throws Exception{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Koneksi k = new Koneksi();
        Connection conn = k.getKoneksi();
        String sql = "UPDATE mahasiswas SET nama=?,gender=? WHERE nobp=?";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,mahasiswa.getNama());
        ps.setString(2,mahasiswa.getGender());
        ps.setString(3,mahasiswa.getNobp());
        ps.executeUpdate();
    }

    @Override
    public void delete(MahasiswaModel mahasiswa) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Koneksi k = new Koneksi();
        Connection conn = k.getKoneksi();
        //nobp,semester,tahun_ajaran,jumlah
        String sql = "DELETE FROM mahasiswas WHERE nobp= ?";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,mahasiswa.getNobp());
        ps.executeUpdate();
    }

    @Override
    public MahasiswaModel getMahasiswaModel(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MahasiswaModel> getAll() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        Koneksi k = new Koneksi();
        Connection conn= k.getKoneksi();
        String sql= "SELECT * FROM mahasiswas";
        PreparedStatement ps= conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<MahasiswaModel> list= new ArrayList<>();
        MahasiswaModel mhs=null;
        while (rs.next()) {
            mhs = new MahasiswaModel();
            mhs.setNobp(rs.getString(2));
            mhs.setNama(rs.getString(3));
            mhs.setGender(rs.getString(4));
            list.add(mhs);
        }
        return list;
    }
   
    
}
