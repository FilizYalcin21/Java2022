package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Tokyo";
		sehirler[0][2] = "Kyoto";
		sehirler[1][0] = "Osaka";
		sehirler[1][1] = "Shibuya";
		sehirler[1][2] = "Sapporo";
		sehirler[2][0] = "Yokohama";
		sehirler[2][1] = "Nagazaki";
		sehirler[2][2] = "Sendai";

		for (int i = 0; i <= 2; i++) {
			System.out.println("------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
