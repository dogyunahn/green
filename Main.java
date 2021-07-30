public class Main {
	
	
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int[] a1 = new int[4];
		int[] a2 = new int[4];
		
		int[] b1 = new int[4];
		int[] b2 = new int[4];
		System.out.println("first array");
		for(int i = 0; i < 4; i++) {
			a1[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			a2[i] = scanner.nextInt();
		}
		
		System.out.println("second array");
		
		for(int i = 0; i < 4; i++) {
			b1[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			b2[i] = scanner.nextInt();
		}
		
		
		for(int i = 0; i < 4; i++) {
			System.out.print(a1[i] * b1[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(a2[i] * b2[i] + " ");
		}
	}