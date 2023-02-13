package banditi;

public class Pomeranje extends Akcija {
	private Smer smer;

	public Pomeranje(Kompozicija k, Smer smer) {
		super(k);
		this.smer = smer;
	}

	@Override
	public void izvrsi(Bandit bandit) {
		try {
			var vagonSaBanditom = kompozicija.dohvatiVagon(bandit);
			var vagonSused = kompozicija.dohvatiSusedniVagon(vagonSaBanditom, smer);
			vagonSaBanditom.ukloniBandita(bandit);
			vagonSused.dodajBandita(bandit);
		} catch (GNepostojeciVagon greska) {
		}
	}

	public String toString() {
		return "Pomeranje: " + smer;
	}

}
