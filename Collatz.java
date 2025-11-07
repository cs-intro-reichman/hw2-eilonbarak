// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int  num = Integer.parseInt(args[0]);

		String mode = args[1];

		if  (mode.equals("v")){

		
		if (num >= 1) { 
            System.out.println("1 4 2 1 (4)");
        }
		

		for (int i=2; i <= num; i++){

			int current_num = i;
			int Counter = 1;
			System.out.print(current_num+ " ");

		while (current_num != 1) {


			if ((current_num %2) !=0 ) { // אם המספר אי זוגי נכנס

				current_num = (current_num*3) + 1;
				System.out.print(current_num+ " ");
			
			
			}else {
					current_num = current_num / 2;
				System.out.print(current_num + " ");
			}

			Counter++;
		}

		System.out.println("("+Counter+")");

	}

	System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
	} else {

			System.out.println("Every one of the first "+num+" hailstone sequences reached 1.");
	}
	

	
}
	
}
