package banditi;

import java.util.ArrayList;
import java.util.List;

public class Kompozicija {

	List<Vagon> vagoni = new ArrayList<>();

	public Kompozicija dodajVagon(Vagon v) {
		vagoni.add(v);
		return this;
	}

	public Vagon dohvatiVagon(Bandit b) throws GNepostojeciVagon {
		return vagoni
				.stream()
				.filter(v -> v.sadrziBandita(b))
				.findFirst()
				.orElseThrow(() -> new GNepostojeciVagon());
	}

	public Vagon dohvatiSusedniVagon(Vagon v, Smer smer)
			throws GNepostojeciVagon {
		if (!vagoni.contains(v))
			throw new GNepostojeciVagon();
		try {
			int susedIndex = vagoni.indexOf(v) + smer.znakSmera();
			return vagoni.get(susedIndex);
		} catch (IndexOutOfBoundsException e) {
			throw new GNepostojeciVagon();
		}
	}

	public String toString() {
		if (vagoni.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(vagoni.get(0));
		for (int i = 1; i < vagoni.size(); i++) {
			sb.append('_').append(vagoni.get(i));
		}
		return sb.toString();
	}

}
