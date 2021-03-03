package szobeolvasasref1;

import java.util.ArrayList;
import java.util.Scanner;

public class SzoBeolvasasApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SzoBeolvasasRefactored1 app = new SzoBeolvasasRefactored1();
		ArrayList<String> szavak = app.szavakatELtarol();
		app.kiirArrayList(szavak);
		ArrayList<String> ismetlodo = app.ismetlodoketEltarol(szavak);
		app.kiirArrayList(ismetlodo);
	}

}
