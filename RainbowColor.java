class RainbowColor{
	public static void main(String arg[]){
	 System.out.println(" to find the given color in rainbow");
	 String rainbow="yellow";
		System.out.println("if the color " + rainbow + " is in the rainbow?");
		switch(rainbow){
			case "violet": System.out.println("yes color is present in the rainbow");
			break;
			case "indigo": System.out.println("yes color is present in the rainbow ");
			break;
			case "blue": System.out.println("yes color is present in the rainbow");
			break;
			case "green": System.out.println("yes color is present in the rainbow");
			break;
			case "orange": System.out.println("yes color is present in the rainbow");
			break;
			case "yellow": System.out.println("yes color is present in the rainbow");
			break;
			case "red": System.out.println("yes color is present in the rainbow");
			break;
		
		default:
			System.out.println("invalid color");
		break;
			}

	}
}