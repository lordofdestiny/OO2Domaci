package masina;

public class Sabiranje implements Operacija {

	@Override
	public void izvrsi(Stek stack) {
		int a = stack.ukloni();
		if ( a == -1000) return;
		int b = stack.ukloni();
		if(b == -1000) return;
		stack.dodaj(a + b);
	}

}
