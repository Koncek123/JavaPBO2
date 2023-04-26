/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan26Apr23;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int menu;
        Account a1= new Account();
        a1.setAccountName("Fajar");
        a1.setAccountNum(2101092001);
        a1.setBalance(500000);
        System.out.println("Anda mau melakukan transaksi: ");
        System.out.println("1. Penarikan \n"
                         + "2. Deposit \n"
                         + "3. Informasi Saldo");
        System.out.print("\nPilihan: ");
        menu= s.nextInt();
        
        switch (menu){
            case 1: a1.setTarik(50000);
                    a1.info();
                    break;
            case 2: a1.setDeposit(100000);
                    a1.info();
                    break;
            case 3: a1.info();
                    break;
        }
    }
}
