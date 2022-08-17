package javasessions;

public class Practice {
	
	int a[] = new int[5];
	
	public int[] addArr() {
		
		for(int i=0; i<5;i++) {
			
			a[i] = i+2;
		}
		
		return a;
		
	}
	
	public void printArr(int b[]) {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Value is :" + b[i]);
		}
		
	}


	public static void main(String[] args) {
		
		Practice p = new Practice();
		
		int c[] = p.addArr();
		
		p.printArr(c);
		
				
}
}



