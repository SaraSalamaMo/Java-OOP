package finalProject;

public enum Coin {
	
	
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25),
	DOLLAR(100),
	TWODOLLAR(200);
	
	private final int value ;
	
	private Coin (int val) {
		
		this.value = val;
	}
	
	public int value() {
		
		return this.value ;
		
	}

}
