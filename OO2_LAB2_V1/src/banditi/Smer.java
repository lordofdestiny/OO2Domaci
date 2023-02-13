package banditi;

public enum Smer {
	ISPRED(-1), IZA(1);
	
	private int pomeraj;
	
	private Smer(int vrednost) {
		this.pomeraj = vrednost;
	}

	public int znakSmera() {
		return this.pomeraj;
	}
}
