package pkg22205009.pbo.lat58;

/**
 * Nama         : Asmalik Hudri
 * Prodi        : Teknik Informatika
 * Semester     : 3
 * Matakuliah   : Pemrograman Berorientasi Objek (PBO)
 */

// Kelas dasar yang mempresentasikan bilangan
class Bilangan {

    protected int x;    //Variabel untuk menyimpan x
    protected int y;    //Variabel untuk menyimpan y
    
    public Bilangan(){
       this.x = 3;
       this.y = 4;
    }
    
    // Method Getter untuk mendapatkan nilai x
    public int getX(){
        return x;
    }
    
    // Method Getter untuk mendapatkan nilai y
    public int getY(){
        return y;
    }
}

// Kelas turunan yang mempresentasikan jumlah bilangan
class JumlahBilangan extends Bilangan {
    
    // Method untuk menghitung hasil penjumlahan
    public void tampilHasilJumlah(){
        System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
    }
}

// Kelas turunan yang mempresentasikan selisih bilangan
class SelisihBilangan extends Bilangan{
    
    // Method untuk menghitung selisih
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX()+ " - " + getY() + " = " + (getX() - getY()));
    }
}

// Kelas utama yang berisi method main untuk menjalankan program
public class PBOLat58{
    
    public static void main(String[] args) {
        //Membuat objek JumlahBilangan
        JumlahBilangan jm = new JumlahBilangan();
        jm.tampilHasilJumlah();
        
        //Membuat objek Selisih Bilangan
        SelisihBilangan sb = new SelisihBilangan();
        sb.tampilSelisih();
    }
}