package finalProject;

public class NotSufficientPaidException extends Exception {

	private String s1 ;
	public  NotSufficientPaidException (String s) {
		
		this.s1=s;
	}
	
	public String toString(){ 
		return ("Money Exception Occurred: "+this.s1) ;
	   }

}
