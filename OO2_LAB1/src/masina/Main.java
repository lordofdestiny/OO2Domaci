package masina;

public class Main {

	public static void main(String[] args) {
		
		Stek stek = new Stek(3);
		
		Program program = new Program(stek);
		
		Operacija[] operacije = { new Dodavanje(5), new Dodavanje(4), new Dodavanje(2), new Sabiranje(), new Uklanjanje(1), new Dodavanje(4), new Maksimum() };
		
		for(Operacija operacija : operacije) {
			program.dodaj(operacija);
		}
		
		program.izvrsi();
		System.out.println(stek);
	}

}
