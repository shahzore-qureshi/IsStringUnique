public class ISU {

	public static void main(String[] args) {

		if(args.length == 0 || args.length > 1) {
			System.out.println("Please enter one String.");
			return;
		}

		String input = args[0];

		//Assuming that alphabet is limited to ASCII (128).
		if(input.length() > 128) {
			System.out.println("String is not unique.");
		}

		boolean[] alphabet = new boolean[128];
		
		//Check if each letter is unique by seeing
		//if each one only appears once. The array
		//above with booleans allows us to check
		//if a character has been used twice.
		for(int i = 0; i < input.length(); i++) {
			int charCode = input.charAt(i);
			if(alphabet[charCode]) {
				System.out.println("String is not unique.");
				return;
			}
			alphabet[charCode] = true;
		}

		//If code has made it this far,
		//input string is most likely unique.
		System.out.println("String is unique.");

	}

}
