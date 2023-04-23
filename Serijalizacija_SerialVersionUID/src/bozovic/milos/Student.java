package bozovic.milos;

import java.io.Serializable;

public class Student implements Serializable {
	
	//deklaracija i inicijalizacija SerialVersionUID
	private static final long serialVersionUID = 1L;
	
	int indeks;
	String ime;
	
	public Student(int indeks, String ime) {
		this.indeks = indeks;
		this.ime = ime;
	}

}
