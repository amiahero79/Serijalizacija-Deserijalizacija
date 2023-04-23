package bozovic.milos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

	try {
		//kreiramo objekat
		Student s1 = new Student(50936, "Milos Bozovic");
		//Kreiramo tok i upis u objekat
		FileOutputStream fout = new FileOutputStream("trensient.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		//zatvaramo tok
		out.close();
		
		System.out.println("Uspešan upis.");
		
	}catch(Exception e) {
		System.out.println(e);
	}	
	try {
		//Kreiranje toka i čitanje iz objekta
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("trensient.txt"));
		Student s = (Student)in.readObject();
		
		//štampanje podataka iz serijalizovanog objekta
		//očekujemo null za ime
		System.out.println(s.indeks + " " + s.ime);
		//zatvaramo tok
		in.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}	
		
	}

}
