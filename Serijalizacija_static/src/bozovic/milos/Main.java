package bozovic.milos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

	try	{
		
		//kreiramo objekat
		Radnik r1 = new Radnik(1234, "Pera Peric", Radnik.kompanija);
		
		//kreiramo tok i upis u objekat
		FileOutputStream fout = new FileOutputStream("statik.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(r1);
		out.flush();
		//zatvaramo tok
		out.close();
		
		System.out.println("Uspešan upis");
	
	}catch(Exception e) {
		System.out.println(e);
	}
	try {
		//kreiramo tok za čitanje 
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("statik.txt"));
		Radnik r = (Radnik)in.readObject();
		
		//štampanje podataka iz serijalizovanog objekta
		System.out.println(r.jmbg + " " + r.ime + " " + r.kompanija);
		
		//zatvaramo tok
		in.close();

	}catch(Exception e){
		System.out.println(e);
	}
		
		
	}

}
