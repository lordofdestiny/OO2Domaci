package banditi;

public abstract class Akcija {

	Kompozicija kompozicija;

	public Akcija(Kompozicija k) {
		this.kompozicija = k;
	}

	public abstract void izvrsi(Bandit b);
}
