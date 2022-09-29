package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "Nishimiya";
		String ogrenci2 = "Reigen";
		String ogrenci3 = "Anya";
		String ogrenci4 = "Bakugou";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("--------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Nishimiya";
		ogrenciler[1] = "Reigen";
		ogrenciler[2] = "Anya";
		ogrenciler[3] = "Bakugou";
		// ogrenciler[4] = "Akabane"; -> out of bounds hatası verir (dizimiz 4 elemanlı
		// olmadıydı)

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("--------------------");

		// reverse engineering - bakarsın

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
