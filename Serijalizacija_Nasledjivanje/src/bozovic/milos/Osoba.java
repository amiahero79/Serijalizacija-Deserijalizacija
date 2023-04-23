package bozovic.milos;

import java.io.Serializable;

public class Osoba implements Serializable {
	
	int indeks;
	String ime;
	
	Osoba(int indeks, String ime) {
		this.indeks = indeks;
		this.ime = ime;
	}

}
