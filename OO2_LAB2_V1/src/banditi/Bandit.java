package banditi;

public class Bandit {
	public static enum Tim {
		A, B
	}

	private Tim tim;
	private int zlatnici;
	
	public Bandit(Tim tim, int zlatnici) {
		this.tim = tim;
		this.zlatnici = zlatnici;
	}
	
	public Bandit(Tim tim) {
		this(tim, 50);
	}
	
	public Tim dohvatiTim() {
		return tim;
	}
	
	public int dohvatiBrojZlatnika() {
		return zlatnici;
	}
	
	public void promeniBrojZlatnika(int broj) {
		this.zlatnici += broj;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append(tim).append(zlatnici).toString();
	}
	
}
