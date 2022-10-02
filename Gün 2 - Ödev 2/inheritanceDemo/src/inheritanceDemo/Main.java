package inheritanceDemo;

// bu örnekte polimorfizm görmüş olduk aslında :)

public class Main {

	public static void main(String[] args) {

		/*
		 * OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		 * ogretmenKrediManager.hesapla();
		 */

		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new AskerKrediManager());

	}

}
