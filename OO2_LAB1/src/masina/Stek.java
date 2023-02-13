package masina;

public class Stek {
	private int[] data; 
	private int next;
	
	public Stek(int size) {
		this.data = new int[size];
		this.next = 0;
	}
	
	public void dodaj(int value) {
		if(next == data.length) return;
		data[next++] = value;
	}
	
	public int ukloni() {
		if(next == 0) return -1000;
		return data[--next];
	}
	
	
	@Override
	public String toString() {
		if(next == 0 ) return "[]";
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(data[0]);
		for(int i = 1; i < next; i++) {
			sb.append(',').append(data[i]);
		}
		sb.append(']');
		return sb.toString();
	}
}
