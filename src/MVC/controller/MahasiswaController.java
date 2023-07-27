/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.controller;

import MVC.dao.MahasiswaDao;
import MVC.model.MahasiswaModel;
import MVC.view.MahasiswaView;
import MVC.dao.MahasiswaDaoImplement;
import java.util.List;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ACER
 */
public class MahasiswaController {
    private MahasiswaView mahasiswaView;    
    private MahasiswaDao mahasiswaDao;
    private MahasiswaModel mahasiswaModel;

    public MahasiswaController(MahasiswaView mahasiswaView){
        this.mahasiswaView= mahasiswaView;
        mahasiswaDao = new MahasiswaDaoImplement();
    }
    
    public void SimpanData(){
        try {
            mahasiswaModel = new MahasiswaModel();
            mahasiswaModel.setNobp(mahasiswaView.txtNoBp().getText());
            mahasiswaModel.setNama(mahasiswaView.txtNama().getText());
            mahasiswaModel.setGender(mahasiswaView.txtGender().getText());
            mahasiswaDao.save(mahasiswaModel);
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateData(){
        try {
            mahasiswaModel= new MahasiswaModel();
            mahasiswaModel.setNobp(mahasiswaView.txtNoBp().getText());
            mahasiswaModel.setNama(mahasiswaView.txtNama().getText());
            mahasiswaModel.setGender(mahasiswaView.txtGender().getText());
            mahasiswaDao.update(mahasiswaModel);
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SeluruhTable(){
        try{
            DefaultTableModel tabelModel= (DefaultTableModel) mahasiswaView.getTabelMahasiswa().getModel();
            tabelModel.setRowCount(0);
            List<MahasiswaModel> mahasiswaList= mahasiswaDao.getAll();
            for (MahasiswaModel mahasiswa: mahasiswaList){
                Object[] data={
                    mahasiswa.getNobp(),
                    mahasiswa.getNama(),
                    mahasiswa.getGender(),
                };
                tabelModel.addRow(data);
            }  
        }
        catch(Exception ex){
            Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void DeleteData(){
        try {
            mahasiswaModel = new MahasiswaModel();
            mahasiswaModel.setNobp(mahasiswaView.txtNoBp().getText());
            mahasiswaDao.delete(mahasiswaModel);
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}
