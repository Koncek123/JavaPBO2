/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import helper.DummyData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class SearchControllerDosen implements ActionListener{
    private JTextField search = new JTextField();
    private DefaultTableModel model;
    
    public SearchControllerDosen(JTextField search, DefaultTableModel model){
        this.search=search;
        this.model=model;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String searchDataString= this.search.getText();
        if(searchDataString.trim().equals("*")){
            model.setDataVector(DummyData.data_Dosen, DummyData.Table_HEADER_Dosen);
            return;
        }
        
        Object [][] newData= new Object[DummyData.data_Mhs.length][];
        
        int index=0;
        for(Object[] obj:DummyData.data_Dosen){
            if(String.valueOf(obj[1]).toUpperCase().contains(searchDataString.toUpperCase().trim())){
                newData[index++]=obj;
            }
            model.setDataVector(newData, DummyData.Table_HEADER_Dosen);
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
