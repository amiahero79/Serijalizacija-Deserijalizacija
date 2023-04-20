# Serijalizacija-Deserijalizacija

Serijalizacija je proces prevođenja objekta u niz bajtova kako bi objekat mogao biti sačuvan u datoteci, 
memorijskom baferu ili prenet preko mreže kako bi mogao kasnije da se vrati u prvobitan oblik.
Serijalizacija klase je omogućena implementacijom interfejsa Serializable (java.io.Serializable)
Sve potklase ovako definisane klase automatski imaju mogućnost serijalizacije. Interfejs Serializable nema metode ili polja i služi samo za identifikaciju 
serijalizacione semantike. Interfejsi poput Serializable intrefejsa su Cloneable i Remote.
Deserijalizacija je obrnuti proces ekstrakcije objekta ili strukture podataka iz sekvence bajtova.
Kada se serijalizovani objekat upiše u fajl, kasnije se može pročitati iz fajla i deserijalizovati, 
što znači da tip informacije i bajtova koji predstavljaju objekat i njegove podatke se može iskoristiti da se objekat ponovo kreira u memoriji.
Tokom deserijalizacije, polja neserijalizabilnih klasa će biti inicijalizovana upotrebom podrazumevanog konstruktora. 
Podrazumevani konstruktor bazne klase mora biti dostupan serijalizabilnoj izvedenoj klasi.
Polja serijalizabilnih potklasa će biti inicijalizovana iz odgovarajućeg toka.
Klase ObjectInputStream i ObjectOutputStream su tokovi visokog nivoa koji sadrže metode za serijalizaciju i deserijalizaciju objekata.
Za serijalizaciju objekta pozivamo metodu writeObject() klase ObjectOutputStream, a za deserializaciju pozivamo metodu readObject() klase ObjectInputStream.
ObjectOutputStream.writeObject() je metoda koja upisuje stanje objekta (npr. u datoteku) kako bi odgovarajuća metoda za čitanje ObjectInputStream.readObject()
mogla da povrati sačuvano stanje objekta.

ObjectOutputStream klasa

Konstruktor:
public ObjectOutputStream(OutputStream out) throws IOException {}  kreira ObjectOutputStream koji piše u navedeni OutputStream.

Metode:
public final void writeObject(Object obj) throws IOException {} Zapisuje navedeni objekat u ObjectOutputStream.

public void flush() throws IOException {}
public void close() throws IOException {}  Zatvara trenutni izlazni tok.

ObjectInputStream klasa:
