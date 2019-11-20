package finalProject;

public class SoldOutException extends Exception{
	
	private  String s1 ;
	
	public SoldOutException(String s) {
		
		this.s1=s;
	}
	
	public String toString(){ 
		return ("Sold out Exception Occurred: "+this.s1) ;
	   }

}
