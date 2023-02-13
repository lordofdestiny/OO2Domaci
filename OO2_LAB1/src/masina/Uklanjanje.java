package masina;

public class Uklanjanje implements Operacija {
	int count;
	
	public Uklanjanje(int count) {
		this.count = Math.max(count, 1);
	}
	
	@Override
	public void izvrsi(Stek stack) {
		for(int i = 0; i < count; i++) {
			int a = stack.ukloni();
			if (a == -1000) break;
		}
	}

}
