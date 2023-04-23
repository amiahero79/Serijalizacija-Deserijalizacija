package bozovic.milos;

import java.io.Serializable;

public class Student implements Serializable {
	
	//ključnu reč transient koristimo kad ne želimo da 
	//se određeni atribut serijalizuje
	//vratiće defaultnu vrednost, u slučaju int biće 0
	//u slučaju String biče null
    int indeks;
	transient String ime;
	
	public Student(int indeks, String ime) {
		this.indeks = indeks;
		this.ime = ime;
	}

}
