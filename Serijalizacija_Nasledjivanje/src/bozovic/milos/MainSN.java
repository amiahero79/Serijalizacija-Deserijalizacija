package bozovic.milos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSN {

	public static void main(String[] args) {
		
	try {
		//Kreiranje objekta
		Student s1 = new Student(50936, "Milos Bozovic", "OOP", 100);
		
		//Kreiranje toka i upis u objekat
		FileOutputStream fout = new FileOutputStream("student.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		
		//zatvaranje toka
		out.close();
		
		System.out.println("Uspešan upis!");
		
	} catch(Exception e) {
		System.out.println(e);
	}	
	try {
		
		//Kreiranje toka za čitanje upisanog u objekat
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"));
		Student s = (Student)in.readObject();
		
		//štampanje podataka iz serijalizovanog objekta
		System.out.println(s.indeks + " " + s.ime + " " + s.kurs + " " + s.cena);
		
		//zatvaranje toka
		in.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}		

	}

}
