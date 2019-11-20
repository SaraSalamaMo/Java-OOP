package finalProject;

public class Soda extends Item{

	private final static int cost = 35;
	private static int numberOfSoda =50;
	private int num ;
	Inventory x =new Inventory();
	
	public Soda (int number) {
		this.num=number;
		numberOfSoda-=this.num;
		
		try {
			x.inventoryOfSoda(numberOfSoda);
			
		} catch (SoldOutException exp) {
			 System.out.println(exp);
			 numberOfSoda=0;
		}
	}

	@Override
	public int getCost() {
		try {
			x.inventoryOfSoda(numberOfSoda);
			return this.num*cost;
		}
		catch (SoldOutException exp) {
			 return 0;
		}
		
		
	}

	@Override
	public void print() {
		try {
			x.inventoryOfSoda(numberOfSoda);
			System.out.println(" Soda :" + "    "+ this.num +"      " + this.getCost());
			
		}
		catch (SoldOutException exp) {
			 
		}
		
		
	}

	@Override
	public void showInventory() {
		System.out.println(" No of Soda :" + "    "+ numberOfSoda  );
		
	}

	@Override
	public void cancel() {
		try {
			x.inventoryOfSoda(numberOfSoda);
			numberOfSoda += this.num;
			
		} catch (SoldOutException exp) {
			
		}
	
	}

}
