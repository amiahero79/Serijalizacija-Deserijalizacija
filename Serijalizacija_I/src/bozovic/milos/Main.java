package bozovic.milos;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
	try {
	//Kreiramo objekat
	Student s1 = new Student(50936, "Milos Bozovic");
	
	//Kreiranje stream-a i metode writeOject() klase ObjectOutputStream
	//neophodne za serijalizaciju
	
	FileOutputStream fout = new FileOutputStream("f.txt");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	
	out.writeObject(s1);
	
	out.flush();
	
	//zatvaramo stream
	out.close();
	
	System.out.println("Uspeli smo da serijalizujemo objekat");	
	}	catch(Exception e) {
		System.out.println(e);
	}
		

	}

}
