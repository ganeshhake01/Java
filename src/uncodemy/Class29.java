package uncodemy;

public class Class29 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println("Outer loop count:" + i); 
			System.out.print("Inner loop count:");
			int t = 5; 
			while(t < 25) { 
			if(t == 25) 
			break; // terminate loop if t is 10 
			System.out.print(t +" ");
			t++;
			}
			System.out.println();
			System.out.println();
			}
			System.out.println("Loops complete.");

	}

}
