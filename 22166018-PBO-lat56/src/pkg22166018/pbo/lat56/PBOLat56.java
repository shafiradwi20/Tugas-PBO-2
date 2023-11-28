/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
package pkg22166018.pbo.lat56;

public class PBOLat56 { 
}
        // Kelas BarangAntik
class BarangAntik {
    private final int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}

// Kelas Radio yang merupakan turunan dari BarangAntik
class Radio extends BarangAntik {
    private String name;

    public Radio(int umur) {
        super(umur);
        this.name = "Radio AM";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

    class main {

        public main() {
        }
    }

// Kelas Main untuk menjalankan program

public class Main {
    public static void main(String[] args) {
        // Inputan dari deskripsi adalah "234"
        int umurBarangAntik = 234;

        // Membuat objek Radio
        Radio radio = new Radio(umurBarangAntik);

        // Menampilkan nama barang dan umur menggunakan method tampilUmur()
        System.out.println("Nama barang Antik: " + radio.getName());
        radio.tampilUmur();
    }
}