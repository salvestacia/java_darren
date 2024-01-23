import java.util.Scanner;

interface perhitungan{
	void hitung(double x, double y);
}

class penjumlahan implements perhitungan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x+y;
		System.out.println("hasil penjumlahan: "+hasil);
	}
}

class pengurangan implements perhitungan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x-y;
		System.out.println("hasil pengurangan: "+hasil);
	}
}

class perkalian implements perhitungan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x*y;
		System.out.println("hasil perkalian: "+hasil);
	}
}

class pembagian implements perhitungan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x/y;
		System.out.println("hasil pembagian: "+hasil);
	}
}

class modulus implements perhitungan{
	public void hitung(double x, double y){
		double hasil;
		hasil = x%y;
		System.out.println("hasil modulus: "+hasil);
	}
}

public class calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan 2 bilangan!");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		penjumlahan calculation1 = new penjumlahan();
		pengurangan calculation2 = new pengurangan();
		perkalian calculation3 = new perkalian();
		pembagian calculation4 = new pembagian();
		modulus calculation5 = new modulus();
		
		calculation1.hitung(a,b);
		calculation2.hitung(a,b);
		calculation3.hitung(a,b);
		calculation4.hitung(a,b);
		calculation5.hitung(a,b);
	}
}