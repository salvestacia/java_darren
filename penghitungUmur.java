import java.util.Scanner;

class ageCount{
	Scanner input = new Scanner (System.in);
	
	void hitungUmur(){
		System.out.println("Silahkan input tahun lahir anda!");
		System.out.println();
		int tahunLahir = input.nextInt();
		int umur = 2023 - tahunLahir;
		System.out.println("Umur anda adalah: "+umur);
		
		System.out.println();
		if(umur < 13 && umur > 5){ //6-12 tahun
			System.out.println("Anda adalah anak-anak!");
		}
		else if(umur >= 13 && umur < 21){ //13-20 tahun
			System.out.println("Anda adalah remaja!");
		}
		else if(umur >=21 && umur < 60){ //21-59 tahun
			System.out.println("Anda adalah dewasa");
		}
		else if(umur >= 60){ //lebih dari 60 tahun
			System.out.println("Anda adalah lansia");
		}
	}
}

public class penghitungUmur{
	public static void main(String[] args){
		ageCount counter = new ageCount();
		
		System.out.println("Selamat datang di aplikasi penghitung umur!!");
		
		counter.hitungUmur();
	}
}