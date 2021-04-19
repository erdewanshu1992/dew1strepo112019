package Simple_Java;

public class StarPattern {

	public static void main(String[] args) {

		for(int i=0; i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Next Line");
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
