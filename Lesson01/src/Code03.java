import java.util.Scanner;

public class Code03{

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("please enter an integer: ");
		input = kb.next();  // scanf("%d", &input);
		
		// == ���� �����ڷδ� string �� �Ұ� 
		if(str.equals(input)) { 
			System.out.println("Strings match! :-)");
		}	
		else {
			System.out.println("Strings do not match! :-(");
		}
		
		kb.close();

	}

}
