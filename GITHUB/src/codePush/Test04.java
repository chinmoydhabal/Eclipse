
package codePush;

public class Test04 {
	public static void main(String[] args) {
		// matrix print 6*6 with proper formal space
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}
