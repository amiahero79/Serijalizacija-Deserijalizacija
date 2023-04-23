package bozovic.milos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

	try {
		//Kreiranje objekta
		//nije moguće uneti reference drugih klasa koje nisu serijalizovane
		Student s1 = new Student(1111, "Mika Mikic", "Palisadska 9");
		//Kreiranje objekta i upis u objekat
		FileOutputStream fout1 = new FileOutputStream("agregat.txt");
		ObjectOutputStream out1 = new ObjectOutputStream(fout1);
		out1.writeObject(s1);
		out1.flush();
		//zatvaranje toka
		out1.close();
		
		System.out.println("Uspešan upis");	
	}catch(Exception e) {
		System.out.println(e);
	}	
	try {
		//kreiranje toka za čitanje objekta
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("agregat.txt"));
		Student s = (Student)in.readObject();
		
		//štampanje podataka iz serijalizovanog objekta
		System.out.println(s.indeks + " " + s.ime + " " + s.adresa);
		//zatvaranje toka
		in.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}
		
		
	}

}
