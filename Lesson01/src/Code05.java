public class Code05 {

	public static void main(String[] args) {

		int [] grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 20;
		grades[2] = 55;
		grades[3] = 10;
		grades[4] = 14;
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Grade " + (i+1) + ": " + grades[i]);	
		}
	}
}
