import java.util.Scanner;
public class tesPermutasi {
	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		//Iterasi melalui setiap karakter dalam string
		for (int i = 0; i < str.length(); i++) {

			// mengambil karakter dalam string
			char ch = str.charAt(i);

			//Membuat string baru (ros) tanpa karakter ke-i.
			//mengambil substring dari karakter pertama (indeks 0) hingga karakter sebelum indeks ke-i (indeks i-1)
			//dan mengambil substring yang dimulai dari karakter setelah indeks ke-i (indeks i+1) hingga akhir string.
			String ros = str.substring(0, i) + str.substring(i + 1); 

			// Recurvise call untuk merangkai permutasi dengan karakter yang diambil.
			printPermutn(ros, ans + ch); 
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		printPermutn(s, "");
	}
} 
