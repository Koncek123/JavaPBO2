/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan26Apr23;

/**
 *
 * @author ACER
 */
public class TestBank {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        
        a1.setAccountName("Fajar");
        a1.setAccountNum(2101092001);
        a1.setBalance(100000);
        
        a2.setAccountName("Budi");
        a2.setAccountNum(123456);
        a2.setBalance(50000);
        
        a1.print();
        a2.print();
    }
}
