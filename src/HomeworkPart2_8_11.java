import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;
public class HomeworkPart2_8_11 {

	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 511: ");
		Scanner input = new Scanner(System.in);
		short answer = input.nextShort();
		int intArray[][] = new int[3][3];
		short mask = 0b1;
		for (int i = 0; i < 9; i++){
			short bit = (short)(answer & mask);
			intArray[2-i / 3][2-i % 3] = bit;
			answer = (byte) (answer >> 1);
			CustomMethodToDisplayTheArray(intArray);
			
		}
	}

	private static void CustomMethodToDisplayTheArray(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			   for (int j = 0; j < array[0].length; j++) {
			    if (array[i][j] == 1) {
			     System.out.print("T ");
			    } else {
			     System.out.print("H ");
			    }
			   }
			 
			   System.out.println("");
		}
		
	}

}
