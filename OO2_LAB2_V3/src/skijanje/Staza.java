package skijanje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Staza {
	List<Deonica> deonice;
	private String naziv;

	public Staza(String naziv) {
		this.deonice = new ArrayList<>();
		this.naziv = naziv;
	}

	public void dodaj(Deonica d) {
		this.deonice.add(d);
	}

	public int broj() {
		return deonice.size();
	}

	public double duzina() {
		return deonice
				.stream()
				.map(Deonica::duzina)
				.reduce(Double::sum).get();
	}

	public char oznaka() throws GOznaka {
		if (deonice.isEmpty()) {
			throw new GOznaka();
		}

		Map<Character, Integer> freq = new HashMap<>();
		for (var deonica : deonice) {
			int old = freq.getOrDefault(deonica.oznaka(), 0);
			freq.put(deonica.oznaka(), old + 1);
		}

		int max = freq.values().stream().max(Integer::compare).get();

		return deonice.stream()
				.filter(deonica -> freq.get(deonica.oznaka()) == max)
				.findFirst().get().oznaka();

//		return deonice.stream().collect(Collectors.groupingBy(Deonica::oznaka,
//		HashMap::new, Collectors.counting()))
//		.entrySet().stream().max(Map.Entry.comparingByValue()).get()
//		.getKey();
	}

	public double brzina(double pocetna) {
		if (deonice.isEmpty())
			return pocetna;

		double brzina = pocetna;
		for (var deonica : deonice) {
			brzina = deonica.brzina(brzina);
		}

		return brzina;
	}

	public double vreme(double pocetna) {
		double ukupnoVreme = 0;
		double brzina = pocetna;
		for (var deonica : deonice) {
			ukupnoVreme += deonica.vreme(brzina);
			brzina = deonica.brzina(pocetna);
		}
		return ukupnoVreme;
	}

	public double nagib() {
		return deonice.stream()
				.map(Deonica::nagib)
				.max(Double::compare)
				.get();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append('|');
		sb.append(broj()).append('|');
		sb.append(duzina()).append('|');
		sb.append(nagib()).append("\n[");
		if (!deonice.isEmpty()) {
			sb.append(deonice.get(0));
			for (int i = 1; i < deonice.size(); ++i) {
				sb.append(',').append(deonice.get(i));
			}
		}
		return sb.append(']').toString();
	}
}
