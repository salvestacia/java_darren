import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class restoran {
    static Scanner input = new Scanner(System.in);
    static List<Integer> listSubtotalHargaMakanan = new ArrayList<>();
    static List<Integer> listSubtotalHargaMinuman = new ArrayList<>();
    static List<Integer> jumlahMakanan = new ArrayList<>();
    static List<Integer> jumlahMinuman = new ArrayList<>();
    static List<String> listPesananMakanan = new ArrayList<>();
    static List<String> listPesananMinuman = new ArrayList<>();
    static int hargaBakmi = 30000;
    static int hargaNasiGoreng = 20000;
    static int hargaFanta = 7000;
    static int hargaAirMineral = 4000;
    
    public static void menuRestoran(){
        int pilihan = 0;
        System.out.println("MENU RESTORAN");
        System.out.println("============");
        System.out.println("1.MAKANAN");
        System.out.println("2.MINUMAN");
        System.out.println("3.PEMBAYARAN");
        System.out.println("4.SELESAI");
        System.out.println("------------");
        
        do{
            System.out.println("Pilihan anda:");
            try{
                pilihan = Integer.parseInt(input.next());
                 if(pilihan == 1){
                    menuMakanan();
                }
                else if(pilihan == 2){
                    menuMinuman();
                }
                else if(pilihan == 3){
                    menuPembayaran();
                }
                else if(pilihan == 4){
                    System.exit(0);
                }
            }
            catch(NumberFormatException e){
                System.out.println("Masukan tidak benar. Harap masukkan angka.");
            }
        }while(pilihan != 4);
    }
    
    public static void menuMakanan(){
        int jawaban;
        System.out.println("1. MAKANAN");
        System.out.println("============");
        System.out.println("1. Bakmi           Rp 30000");
        System.out.println("2. Nasi Goreng     Rp 20000");
        System.out.println("3. Selesai");
        System.out.println("------------");
        
        int pilihanMakanan = 0;
        
        do {
        System.out.println("Pilihan anda:");
        try {
            pilihanMakanan = Integer.parseInt(input.next()); 
            if (pilihanMakanan == 1) {
                System.out.println("Masukkan jumlah pesanan:");
                try {
                    jawaban = Integer.parseInt(input.next()); 
                    jumlahMakanan.add(jawaban);
                    int subtotalHargaBakmi = hargaBakmi * jawaban;
                    listSubtotalHargaMakanan.add(subtotalHargaBakmi);
                    listPesananMakanan.add("Bakmi");
                } 
                catch (NumberFormatException e) {
                    System.out.println("Masukan jumlah pesanan tidak benar. Harap masukkan angka.");
                }
            } 
            else if (pilihanMakanan == 2) {
                System.out.println("Masukkan jumlah pesanan:");
                try {
                    jawaban = Integer.parseInt(input.next()); 
                    jumlahMakanan.add(jawaban);
                    int subtotalHargaNasiGoreng = hargaNasiGoreng * jawaban;
                    listSubtotalHargaMakanan.add(subtotalHargaNasiGoreng);
                    listPesananMakanan.add("Nasi Goreng");
                }
                catch (NumberFormatException e) {
                    System.out.println("Masukan jumlah pesanan tidak benar. Harap masukkan angka.");
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Masukan tidak benar. Harap masukkan angka.");
        }
    } while (pilihanMakanan != 3);
    menuRestoran();
    }
    
    public static void menuMinuman(){
        int jawaban;
        System.out.println("2. MINUMAN");
        System.out.println("============");
        System.out.println("1. Fanta           Rp 7000");
        System.out.println("2. Air Mineral     Rp 4000");
        System.out.println("3. Selesai");
        System.out.println("------------");
        
        int pilihanMinuman = 0;
        
        do {
        System.out.println("Pilihan anda:");
        try {
            pilihanMinuman = Integer.parseInt(input.next()); 
            if (pilihanMinuman == 1) {
                System.out.println("Masukkan jumlah pesanan:");
                try {
                    jawaban = Integer.parseInt(input.next()); 
                    jumlahMinuman.add(jawaban);
                    int subtotalHargaFanta = hargaFanta * jawaban;
                    listSubtotalHargaMinuman.add(subtotalHargaFanta);
                    listPesananMinuman.add("Fanta");
                } 
                catch (NumberFormatException e) {
                    System.out.println("Masukan jumlah pesanan tidak benar. Harap masukkan angka.");
                }
            } 
            else if (pilihanMinuman == 2) {
                System.out.println("Masukkan jumlah pesanan:");
                try {
                    jawaban = Integer.parseInt(input.next()); 
                    jumlahMinuman.add(jawaban);
                    int subtotalHargaAirMineral = hargaAirMineral * jawaban;
                    listSubtotalHargaMinuman.add(subtotalHargaAirMineral);
                    listPesananMinuman.add("Air Mineral");
                } 
                catch (NumberFormatException e) {
                    System.out.println("Masukan jumlah pesanan tidak benar. Harap masukkan angka.");
                }
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Masukan tidak benar. Harap masukkan angka.");
        }
    } while (pilihanMinuman != 3);
    menuRestoran();
    }
    
    public static void menuPembayaran(){
        System.out.println("3. PEMBAYARAN");
        System.out.println("=================");
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "Rincian Makanan", "Harga", "Jumlah", "Subtotal"));
        System.out.println("------------------------------------------------------------");
        int totalMakanan = 0;
        for (int i = 0; i<listPesananMakanan.size(); i++){
            String makanan = listPesananMakanan.get(i);
            int harga = 0;
            int jumlahPesanan = jumlahMakanan.get(i);
            int subtotal = listSubtotalHargaMakanan.get(i);
            
            if (makanan.equals("Bakmi")) {
                harga = hargaBakmi;
            }
            else if (makanan.equals("Nasi Goreng")) {
                harga = hargaNasiGoreng;
            }
            
            subtotal = harga * jumlahPesanan;
            System.out.println(String.format("%-20s %-15s %-15s %-15s", makanan, harga, jumlahPesanan, subtotal));
            totalMakanan += subtotal;
        }
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "", "----------"));
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "Total Makanan:", totalMakanan));
        
        System.out.println();
        System.out.println();
        
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "Rincian Minuman", "Harga", "Jumlah", "Subtotal"));
        System.out.println("------------------------------------------------------------");
        int totalMinuman = 0;
        for (int i = 0; i<listPesananMinuman.size(); i++){
            String minuman = listPesananMinuman.get(i);
            int harga = 0;
            int jumlahPesanan = jumlahMinuman.get(i);
            int subtotal = listSubtotalHargaMinuman.get(i);
            
            if (minuman.equals("Fanta")) {
                harga = hargaFanta;
            }
            else if (minuman.equals("Air Mineral")) {
                harga = hargaAirMineral;
            }
            
            subtotal = harga * jumlahPesanan;
            System.out.println(String.format("%-20s %-15s %-15s %-15s", minuman, harga, jumlahPesanan, subtotal));
            totalMinuman += subtotal;
        }
        int pembayaran;
        int bayar = 0;
        int kembali = 0;
        int totalKeseluruhan = 0;
        boolean masukan = false;
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "", "----------"));
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "Total Minuman:", totalMinuman));
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "", "=========="));
        
        System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "TOTAL Keseluruhan:", totalKeseluruhan = totalMakanan + totalMinuman));
        while(!masukan){    
            try{
                bayar = Integer.parseInt(input.next());
                masukan = true;
            }
            catch(NumberFormatException e){
                System.out.println("Masukan tidak benar. Harap masukkan angka.");
            }
            System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "Bayar:", pembayaran = bayar));
        }
        if(bayar == totalKeseluruhan){
            System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "Kembali:", kembali));
            menuRestoran();
        } 
        else if(bayar > totalKeseluruhan){
            System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "Kembali:", kembali = bayar - totalKeseluruhan));
            menuRestoran();
        }
        else if(bayar < totalKeseluruhan){
            System.out.println(String.format("%-20s %-15s %-15s %-15s", "", "", "Kembali:", kembali));
            System.out.println("uang anda kurang!");
            menuPembayaran();
        }
    }
    
    public static void main(String[] args){
        menuRestoran();
    }
}