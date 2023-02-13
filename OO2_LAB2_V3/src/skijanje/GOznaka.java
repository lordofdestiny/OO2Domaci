package skijanje;

public class GOznaka extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2952835823788292134L;

	public GOznaka() {
		super("Ne može se dohvatiti oznaka za praznu deonicu!");
	}
}
