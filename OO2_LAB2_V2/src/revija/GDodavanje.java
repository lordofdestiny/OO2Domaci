package revija;

public class GDodavanje extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3555875421657083402L;

	public GDodavanje() {
		super("Nije dozvoljeno dodavanje u punu kombinaciju!");
	}
}
