/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan15Mar23;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class seleksi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n,rata,total = 0;
        System.out.println("Program Hitung-hitungan IPK");
        System.out.print("Masukkan Jumlah Makul: ");
        n= in.nextFloat();
        float [] x= new float[10];
        
        for (int i = 1; i <=n; i++) {
            System.out.print("Masukkan nilai makul "+i+": ");
            x[i]=in.nextFloat();
        }
        
        for (int i=1; i<=n;i++){
            System.out.println("Nilai Makul "+i+"= "+x[i]);
            total=total+x[i];
        }
        
        System.out.println("Total = "+total);
        rata=total/n;
        System.out.println("Rata = "+rata);
        if(rata>3.50){
            System.out.println("Ipk aman");
        }
        else{
            System.out.println("IPK tidak aman");
        }
    }
}
