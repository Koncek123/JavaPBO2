/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.dao;

import MVC.model.MahasiswaModel;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface MahasiswaDao {
    void save (MahasiswaModel mahasiswa) throws Exception;
    void update (MahasiswaModel mahasiswa) throws Exception;
    void delete (MahasiswaModel mahasiswa) throws Exception;
    
    MahasiswaModel getMahasiswaModel(int index);
    List<MahasiswaModel>getAll() throws Exception;
    
}
