import java.util.Scanner;
public class HomeworkPart2_8_11 {

	public static void main(String[] args) {
		// This will display what the program will ask for.
		// Ask for a number between 0 and 511.
		System.out.print("Enter a number between 0 and 511: ");
		Scanner input = new Scanner(System.in);
		// This will convert the number into a binary format
		// limiting it to only 16 bits
		short answer = input.nextShort();
		// This is the Array to keep it into a 3 by 3 grid format.
		int intArray[][] = new int[3][3];
		short mask = 0b1;
		for (int i = 0; i < 9; i++){
			short bit = (short)(answer & mask);
			intArray[2-i / 3][2-i % 3] = bit;
			answer = (byte) (answer >> 1);
			// This is my Custom Method to display my Array
			// Who would have thought.
			CustomMethodToDisplayTheArray(intArray);

		}
	}
			// Here lies my GAWGEOUS custom method.
	private static void CustomMethodToDisplayTheArray(int Array[][]) {
		// This will set my Array to be displayed as "H" and "T"
		// Also sets how the Array will be set up.
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[0].length; j++) {
				if (Array[i][j] == 1) {
					System.out.print("T ");
				} else {
					System.out.print("H ");
				}
			}

			System.out.println("This will conclude the program.");
		}

	}

}
