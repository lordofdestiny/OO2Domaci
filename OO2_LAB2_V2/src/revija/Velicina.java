package revija;

public class Velicina {
	public static enum Oznaka {
		S(1), M(2), L(3);

		private int val;

		private Oznaka(int vrednost) {
			val = vrednost;
		}
	}

	private Oznaka oznaka;

	public Velicina(Oznaka oznaka) {
		this.oznaka = oznaka;
	}

	public boolean manja(Velicina other) {
		return this.oznaka.val < other.oznaka.val;
	}

	public Oznaka dohvOznaku() {
		return oznaka;
	}

	public String toString() {
		return oznaka.toString();
	}
}
