package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı: " + mesaj.length());
		 * 
		 * System.out.println("5. eleman: " + mesaj.charAt(4));
		 * 
		 * System.out.println(mesaj.concat(" Yaşasın!")); // System.out.println(mesaj);
		 * -> mesajda değişiklik yapmamış oldu (concat)
		 * 
		 * System.out.println(mesaj.startsWith("b"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0, 5, karakterler, 0); //
		 * mesajın 0. indeksinden itibaren 5 karakteri karakterler dizisine 0. indeksten
		 * itibaren kopyala System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf("av"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		// System.out.println(mesaj.substring(2)); -> 2. indeksten itibaren demek
		System.out.println(mesaj.substring(2, 5)); // 5 dahil değil

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		System.out.println(mesaj.trim()); // boşlukları kırpar

	}

}
