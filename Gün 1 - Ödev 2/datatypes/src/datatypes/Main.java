package datatypes;

public class Main {

	public static void main(String[] args) {

		// java 'tip güvenli' bir dildir (type-safe? -> yani değişkenin tipinden emin
		// olmak ister?)
		// int sayi = 10888888888; -> hata verir, boyutu aştığı için
		// byte sayi = 128; -> hata verir, (-128, 127) aralığında olmalı
		// double 8 byte'lık veri tutar
		// float 4 byte'lık veri tutar
		// char tipindeki değişkeni "" ile değil, '' ile yazmalısın!
		// "" -> String için kullanılır

		double sayi = 12.5;
		sayi = -129;

		char karakter = 'A';

		boolean dogruMu = false;

	}

}
