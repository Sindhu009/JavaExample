class FullFormOfBranch{
	public static void main(String arg[]){
	 System.out.println(" full form of the given branch");
	 String branch="CS";
		System.out.println("full form of the  branch : " + branch + " is");
		switch(branch){
			case "CS": System.out.println("computer science");
			break;
			case "MH": System.out.println("mechanical ");
			break;
			case "EC": System.out.println("electronic and communication");
			break;
			case "EE": System.out.println("electrical electronic");
			break;
			case "IS": System.out.println("information science");
			break;
			case "CV": System.out.println("civil");
			break;
			case "BC": System.out.println("bio chemistry");
			break;
		
		default:
			System.out.println("invalid branch name");
		break;
			}

	}
}