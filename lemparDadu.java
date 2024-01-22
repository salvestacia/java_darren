import java.util.Scanner;

public class lemparDadu{
	public static void main(String[] args){
		Scanner jawab = new Scanner(System.in);
		char simpanJawab = 'y';
		int min = 1, max = 6;
		int range = max - min+1;
		
		while(simpanJawab == 'y'){
			do{
				int acak = (int)(Math.random() * range+min);
				System.out.println("");
				System.out.println("angka acak ="+acak);
				if(simpanJawab != 'n'){
					System.out.print("apakah mau lempar ulang dadu?[y/n]");
					simpanJawab = jawab.next().charAt(0);
					if((simpanJawab != 'y') && (simpanJawab != 'n')){
						System.out.println("masukkan hanya huruf y kecil atau n kecil!");
						simpanJawab = 'n';
					}
				}
			} while(simpanJawab != 'n'); //simpanJawab tidak sama dengan y
		}
	}
}