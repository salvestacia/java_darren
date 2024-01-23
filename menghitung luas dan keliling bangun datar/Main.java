import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        /*kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
        
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
        
        /*program*/
        //panggil metode 
        mainMenu();
        
        //kondisional untuk pilihan menu yg dimasukkan
        switch(pilihan){
            case '1' :{
                System.out.print("masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("luas persegi panjang: "+opersegi.luas(s1, s2));
                System.out.println("keliling persegi panjang: "+opersegi.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("masukkan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("masukkan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("luas segitiga: "+osegitiga.luas(s1, s2));
                System.out.println("keiling segitiga: "+osegitiga.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("luas lingkaran: "+olingkaran.luas(r));
                System.out.println("keliling lingkaran; "+olingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }
    
    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("hitung luas dan keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
