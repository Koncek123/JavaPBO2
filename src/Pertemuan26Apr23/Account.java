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
public class Account {
    String AccountName;
    int AccountNum;
    int Balance;
    int Deposit;
    int Tarik;
    int hasil;

   

    public int getDeposit() {
        return Deposit;
    }

    public int getTarik() {
        return Tarik;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public int getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(int AccountNum) {
        this.AccountNum = AccountNum;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    
    public void setTarik(int Tarik) {
        this.Tarik = Tarik;
        Balance=Balance-Tarik;
    }
    public void setDeposit(int Deposit){
        this.Deposit=Deposit;
        Balance=Balance+this.Deposit;
    }

    
    void print(){
        System.out.println("Nama Nasabah: "+AccountName+
                           "\nNo. Rekening: "+AccountNum+
                           "\nSaldo: "+Balance+"\n");
    }
    void info(){
        System.out.println("Nama Nasabah: "+AccountName+
                           "\nNo. Rekening: "+AccountNum+
                           "\nJumlah penarikan: "+Tarik+
                           "\nJumlah setoran: "+Deposit+
                           "\nSisa Saldo: "+Balance);
    }
}
