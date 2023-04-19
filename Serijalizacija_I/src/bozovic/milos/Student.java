package bozovic.milos;

import java.io.Serializable;

// Serializable je interfejs bez polja i metoda i 
//služi samo za identifikaciju serijalizacione semantike

public class Student implements Serializable {

	int indeks;
	String ime;

	public Student(int indeks, String ime) {

		this.indeks = indeks;
		this.ime = ime;
	}

// Sada objekti ove klase mogu biti konvertovani u stream
}
