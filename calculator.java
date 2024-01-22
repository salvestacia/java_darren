import java.util.Scanner;
class penjumlahan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x+y;
		System.out.println("hasil penjumlahan: "+hasil);
	}
}

class pengurangan extends penjumlahan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x-y;
		System.out.println("hasil pengurangan: "+hasil);
	}
}

class perkalian extends pengurangan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x*y;
		System.out.println("hasil perkalian: "+hasil);
	}
}

class pembagian extends perkalian{
	public void hitung(double x, double y){
		double hasil;
		hasil = x/y;
		System.out.println("hasil pembagian: "+hasil);
	}
}

class modulus extends pembagian{
	public void hitung(double x, double y){
		double hasil;
		hasil = x%y;
		System.out.println("hasil modulus: "+hasil);
	}
}

public class calculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan 2 bilangan!");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		penjumlahan tambah = new penjumlahan();
		pengurangan kurang = new pengurangan();
		perkalian kali = new perkalian();
		pembagian bagi = new pembagian();
		modulus modulo = new modulus();
		
		tambah.hitung(a,b);
		kurang.hitung(a,b);
		kali.hitung(a,b);
		bagi.hitung(a,b);
		modulo.hitung(a,b);
	}
}
