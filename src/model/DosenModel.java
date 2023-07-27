/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import helper.DummyData;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class DosenModel extends DefaultTableModel{
    public DosenModel(){
        super(DummyData.data_Dosen,DummyData.Table_HEADER_Dosen);
    }
}
