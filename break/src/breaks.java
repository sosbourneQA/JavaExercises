
public class breaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 5; a++) {
			System.out.println("a is: " + a);
			for (int b = 1; b <= 5; b++) {
				System.out.println("b is: " + b);

				if (a == 1 || b == 1) {
					break;
				}
			}
		}
	}

}
