package revija;

public class Model {
	private static int nextID = 0;
	private int id = nextID++;

	private Velicina velicina;

	public Model(Velicina velicina) {
		this.velicina = velicina;
	}

	public int dohvId() {
		return id;
	}

	public Velicina dohvVelicinu() {
		return velicina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Model ");
		sb.append(id).append("(").append(velicina).append(")");
		return sb.toString();
	}
}

