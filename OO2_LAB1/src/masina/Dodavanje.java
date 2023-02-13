package masina;

public class Dodavanje implements Operacija {
	private int value;
		
	public Dodavanje(int value) {
		this.value = value;
	}
	
	@Override
	public void izvrsi(Stek stack) {
		stack.dodaj(value);
	}

}
