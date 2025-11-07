//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

        String word = args[0];

        int Counter = Integer.parseInt(args[1]);

        String upperWord = word.toUpperCase();

        int lengthOfWord = upperWord.length();

        String specialWord = "AEFHILMNORSX" ;

        for (int i = 0; i < lengthOfWord; i++){

                char ch = upperWord.charAt(i);

                if (specialWord.indexOf(ch) >= 0) {
                
                System.out.print("Give me an " + ch + ": ");
            } else {
                
                System.out.print("Give me a " + ch + ": ");
            }
            
            System.out.println(ch + "!");
          } 

            System.out.println("What does that spell?");


         for (int n = 0; n < Counter; n++){

                System.out.println(upperWord+ " !!!");

        }
	    
        }
}
