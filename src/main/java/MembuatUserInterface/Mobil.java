/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MembuatUserInterface;


public class Mobil implements Kendaraan{
// deklarasi variabel yang bernama tipemobil
String typemobil;

// membuat constructor class mobil
public Mobil(){
this.typemobil = "hrv";


// berikan nilai default pada pemanggilan variabel tipe mobil

this.typemobil = "hrv";
}
public void display(){
    System.out.println("Jenis Mobil" + this.typemobil);
}
public void BahanBakar(){
System.out.println("interface method implements");
System.out.println("kendaraan membutuhkan bahan bakar");
}

public static void main(String[] args){
Mobil mobil = new Mobil();

mobil.BahanBakar();

// menampilkan nilai melalui
mobil.display();
}
}
            