package finalProject;

public class NoChangeAvailableException extends Exception{
	
	private String s1 ;
	public  NoChangeAvailableException(String s) {
		
		this.s1=s;
	}
	
	public String toString(){ 
		return ("Exception Occurred: "+this.s1) ;
	   }

}
