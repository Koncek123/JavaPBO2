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
public class MahasiswaModel extends DefaultTableModel{
    public MahasiswaModel(){
        super(DummyData.data,DummyData.Table_HEADER);
    }
}
