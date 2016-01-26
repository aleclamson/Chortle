package exersise;
	import java.io.* ;
	import java.util.Scanner;

	public class exersise3 {
		public static void main(String[] args) {
			java.util.Scanner input = new Scanner(System.in);
				String currentName = "Mike";
				
					while (currentName.length() > 0) {
						System.out.println("\nEnter name:");
						currentName = input.next();
						switch (num(currentName)) {
		  				case 0: System.out.println("Mr. " + currentName);
							break;
		  				case 1: System.out.println("Ms. " + currentName);
							break;
		  				default: System.out.println(currentName);

		
						}
					}
		}
		
		public static int num(String name) {
			if (name.startsWith("Elroy") ||
		  			name.startsWith("Fred")    ||
		  			name.startsWith("Graham")) {
						return 0;
			}else if (name.startsWith("Amy") ||
					name.startsWith("Buffy") ||
					name.endsWith("Cathy")) {
				return 1;
			}
			return 2;
		}
	}


