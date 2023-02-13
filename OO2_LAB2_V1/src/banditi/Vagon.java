package banditi;

import java.util.ArrayList;
import java.util.List;

public class Vagon {
	List<Bandit> banditi = new ArrayList<>();
	
	public void dodajBandita(Bandit b) {
		banditi.add(b);
	}
	
	public int dohvatiBrojBandita() {
		return banditi.size();
	}
	
	public boolean sadrziBandita(Bandit b) {
		return banditi.contains(b);
	}
	
	public void ukloniBandita(Bandit b) {
		banditi.remove(b);
	}
	
	public Bandit dohvatiBandita(int i) {
		return banditi.get(i);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		if (!banditi.isEmpty()) {
			sb.append(banditi.get(0));
		}
		for(int i = 1; i < banditi.size(); i++) {
			sb.append(',').append(banditi.get(i));
		}
		return sb.append(']').toString();
	}
}