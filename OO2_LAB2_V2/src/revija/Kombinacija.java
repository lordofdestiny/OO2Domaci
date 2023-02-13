package revija;

import java.util.ArrayList;
import java.util.List;

public class Kombinacija {
	List<Nosivo> stvari;
	int max_count;

	public Kombinacija(int brojStvari) {
		this.stvari = new ArrayList<>();
		this.max_count = brojStvari;
	}

	public void dodaj(Nosivo nosivo) throws GDodavanje {
		if (stvari.size() == max_count) {
			throw new GDodavanje();
		}

		this.stvari.add(nosivo);
	}

	public int dohvBrStvari() {
		return stvari.size();
	}

	public int dohvMaxBrStvari() {
		return max_count;
	}
	
	public Nosivo dohvStvar(int i) throws GIndeks {
		try {
			return stvari.get(i);
		}catch(IndexOutOfBoundsException iobe) {
			throw new GIndeks();
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (!stvari.isEmpty()) {
			sb.append(stvari.get(0));
			for (int i = 1; i < stvari.size(); ++i) {
				sb.append(",").append(stvari.get(i));
			}
		}
		return sb.append("]").toString();
	}

}

