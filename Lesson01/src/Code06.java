public class Code06 {

	public static void main(String[] args) {

		int [] grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 20;
		grades[2] = 55;
		grades[3] = 10;
		grades[4] = 14;
		
		int i = 0;
		
		while(i < grades.length ) {
			
			System.out.println("grade" + (i+1) + ": " + grades[i]);
			i++;
			
		}
	}
}


// test text :-)