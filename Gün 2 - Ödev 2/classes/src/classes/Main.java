package classes;

public class Main {

	public static void main(String[] args) {

		// sınıflar 'referans tip'tir
		// yani customerManager aslında nesneyi işaret ediyor(referans)?
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();

		// artık ikisi de customerManager2'nin gösterdiği nesneyi işaret ediyor
		// customerManager'ın eskiden gösterdiği nesne, -->
		// --> Garbage Collector tarafından bellekten silinir
		customerManager = customerManager2;

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type
		// değer stack'te tutuluyor
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); // 10

		// reference type
		// diziler referans tiptir :)
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); // 10

	}

}
