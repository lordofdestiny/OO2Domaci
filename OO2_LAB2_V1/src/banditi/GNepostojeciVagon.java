package banditi;

public class GNepostojeciVagon extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3286236054386079634L;

	public GNepostojeciVagon() {
		super("Ni jedan vagon kompozicije ne sadrži datog  bandita!");
	}
}