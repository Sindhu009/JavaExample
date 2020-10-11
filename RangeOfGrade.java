class RangeOfGrade{
	public static void main(String args[]){
	System.out.println("grade according to student scored marks");
	char grade='C';
	 System.out.println(" according to student grade " + grade + " obtained marks is:");
			
		switch(grade){
			case 'A': System.out.println(" marks>=85" );
			break;
			case 'B': System.out.println(" 85<marks>=70" );
			break;
			case 'C': System.out.println(" 70<marks>=50" );
			break;
			case 'D': System.out.println("50<marks>=35");
			break;
			case 'E': System.out.println(" 50<marks>=35");
			break;
			case 'F': System.out.println(" marks<35");
			break;
					
			default:
					System.out.println("it crossed the limit marks and it is invalid");
			
			}
			
		
	
	
	
	}



}