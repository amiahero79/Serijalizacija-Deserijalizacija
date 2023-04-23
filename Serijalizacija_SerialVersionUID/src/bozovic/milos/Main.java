package bozovic.milos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		
	try {
		//kreiramo objekat
		Student s1 = new Student(2222, "Miloš Božović");
		
		//kreiramo tok i upis u objekat
		FileOutputStream fout = new FileOutputStream("serialVersion.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		//zatvaranje toka
		out.close();
		
		System.out.println("Uspešan upis");
		
	}catch(Exception e) {
		System.out.println(e);
	}	
	try {
		//kreiranje toka za čitanje objekta
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("serialVersion.txt"));
		Student s = (Student)in.readObject();
		
		//štampanje podataka iz serijalizovanog objekta
		System.out.println(s.indeks + " " + s.ime);
		//zatvaranje toka
		in.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
	
	}

}
