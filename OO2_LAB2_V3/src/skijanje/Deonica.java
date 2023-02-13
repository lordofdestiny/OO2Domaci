package skijanje;

public abstract class Deonica {
	private double duzina;
	private double nagib;

	public Deonica(double duzina, double nagib) {
		this.duzina = duzina;
		this.nagib = nagib;
	}

	public double duzina() {
		return duzina;
	}

	public double nagib() {
		return nagib;
	}

	public abstract char oznaka();

	public abstract double ubrzanje();

	public double brzina(double pocetna) {
		return Math.sqrt(2 * ubrzanje() * duzina + Math.pow(pocetna, 2));
	}

	public double vreme(double pocetnaBrzina) {
		return (brzina(pocetnaBrzina) - pocetnaBrzina) / ubrzanje();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(oznaka()).append('(').append(duzina);
		sb.append(',').append(nagib).append(')');
		return sb.toString();
	}
}
