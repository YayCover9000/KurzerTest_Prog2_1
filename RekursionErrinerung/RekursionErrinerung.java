package RekursionErrinerung;

public class RekursionErrinerung {
	public static void rek(int x) {
		if(x>0) {
			rek(--x);
			System.out.println(x);
		}
	}
}
