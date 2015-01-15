package tgm;

/**
 * @author FOCK
 *
 */
public class Hello {
	public String toString(){
		return "%helloworldtext%";
	}
	/**
	 * @param args Parameter uebergabe
	 */
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.toString());
	}
}
