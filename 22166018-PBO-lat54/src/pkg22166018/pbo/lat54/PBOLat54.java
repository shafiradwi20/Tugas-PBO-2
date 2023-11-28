/*
Nama      : Shafira Dwi Nur'Izzati
Nim       : 22166018
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

package pkg22166018.pbo.lat54;

import java.util.Scanner;

public class PBOLat54 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================");
        System.out.println("Program Kalkulator");
        System.out.println("=================");

        System.out.println("Masukan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.println("Masukan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        System.out.println("Pilih operasi (+, -, *, /): ");
        String operasi = scanner.next();

        int hasil = 0;

        switch (operasi) {
            case "+":
                hasil = angkaPertama + angkaKedua;
                break;
            case "-":
                hasil = angkaPertama - angkaKedua;
                break;
            case "*":
                hasil = angkaPertama * angkaKedua;
                break;
            case "/":
                hasil = angkaPertama / angkaKedua;
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}
