package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B': // B için de C'nin bloğu çalışır ("İyi : Geçtiniz" yazar.)
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız");
				break;
			default:
				System.out.println("Geçersiz not girdiniz");
		}

		// ctrl+shift+F ile kodların düzenini ayarlayabilirsin (formatting code)
		// [Eclipse için]

	}

}
