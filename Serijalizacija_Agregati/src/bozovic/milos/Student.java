package bozovic.milos;

import java.io.Serializable;

public class Student implements Serializable {
	
int indeks;
String ime;

Adresa adresa; //instanca druge klase (HAS-A)

//ukoliko bi u konstruktoru dodali Adresa adresa, u main klasi bi tražio da 
//izmenimo Adresa adresa u String adresa
public Student(int indeks, String ime, String adresa) {
	this.indeks = indeks;
	this.ime = ime;
	adresa = adresa;
}

}
