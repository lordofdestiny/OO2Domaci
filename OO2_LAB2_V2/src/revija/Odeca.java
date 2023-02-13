package revija;

public class Odeca implements Nosivo {
	private String naziv;
	private Velicina velicina;

	public Odeca(String naziv, Velicina velicina) {
		this.naziv = naziv;
		this.velicina = velicina;
	}

	public String dohvNaziv() {
		return naziv;
	}

	public Velicina dohvVelicinu() {
		return velicina;
	}

	@Override
	public boolean odgovara(Model model) {
		return !velicina.manja(model.dohvVelicinu());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("odeæa ");
		sb.append(naziv).append(" ").append(velicina);
		return sb.toString();
	}
}
