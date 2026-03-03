package QuizPraktikum;

 import java.util.Scanner;

public class Resto28 {
    public String nama;
    public String stok;
    public int harga;


    public Resto28() { }

    public void tambahdata(Scanner sc){
        System.out.print("Nama Menu        : ");
        this.nama = sc.nextLine();
        System.out.print("Stok : ");
        this.stok = sc.nextLine();
        System.out.print("Stok         : ");
        this.stok = sc.nextLine();
        System.out.print("Harga        : ");    
        this.harga = Integer.parseInt(sc.nextLine());
        
    }
    public void cetakInfo() {
        System.out.println("--------------------------------------");
        System.out.println("Nama Menu        : " + nama);
        System.out.println("Stok         : " + stok);
        System.out.println("Harga        : " + harga);
        System.out.println("--------------------------------------");
    }
   

  
   
   
    }

    

