package bozovic.milos;

import java.io.Serializable;

public class Radnik implements Serializable {
	
	int jmbg;
	String ime;
	// neće biti serijalizovan
	// osim ako u objekat ne stavim Radnik.kompanija
	static String kompanija = "Dunav d.o.o.";
	
	public Radnik(int jmbg, String ime, String kompanija) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.kompanija = kompanija;
	}

}
