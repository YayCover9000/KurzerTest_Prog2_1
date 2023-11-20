
public class RekursionErrinerung {
	public static void rek(int x) {
		if(x>0) {
			System.out.println(x);

			rek(--x);
		}
	}
}
