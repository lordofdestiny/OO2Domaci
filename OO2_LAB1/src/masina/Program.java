package masina;

import java.util.LinkedList;
import java.util.List;

public class Program {
	private Stek stack;
	List<Operacija> operations = new LinkedList<>();
	public Program(Stek stack) {
		this.stack = stack;
	}
	
	public void dodaj(Operacija op) {
		this.operations.add(op);
	}
	
	public void izvrsi() {
		while(operations.size() > 0) {
			operations.get(0).izvrsi(stack);
			operations.remove(0);
		}
	}

}
