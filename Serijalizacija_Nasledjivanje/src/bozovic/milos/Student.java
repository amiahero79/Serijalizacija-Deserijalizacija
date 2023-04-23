package bozovic.milos;

public class Student extends Osoba {

	String kurs;
	int cena;
	
	public Student(int indeks, String ime, String kurs, int cena) {
		super(indeks, ime);
		this.kurs = kurs;
		this.cena = cena;
	}
	
}
