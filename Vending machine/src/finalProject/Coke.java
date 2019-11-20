package finalProject;

public class Coke extends Item {

	private final static int  cost =25;
	private static int numberOfCoke =60;
    private int num ;
    Inventory x =new Inventory();
    
	public Coke(int number) {
		this.num=number;
		numberOfCoke -= this.num;
		
		try {
			x.inventoryOfCoke(numberOfCoke);
			
		} catch (SoldOutException exp) {
			 System.out.println(exp);
			 numberOfCoke=0;
		}
	}

	@Override
	public int getCost() {
		
		try {
			x.inventoryOfCoke(numberOfCoke);
			return this.num*cost;
		}
		catch (SoldOutException exp) {
			 return 0;
		}
	}

	@Override
	public void print() {
		try {
			x.inventoryOfCoke(numberOfCoke);
			System.out.println(" Coke :" + "    "+ this.num +"      " + this.getCost());
			
		}
		catch (SoldOutException exp) {
			 
		}
		
		
	}

	@Override
	public void showInventory() {
		System.out.println(" No of Coke :" + "    "+ numberOfCoke  );		
	}

	@Override
	public void cancel() {
		try {
			x.inventoryOfCoke(numberOfCoke);
			numberOfCoke += this.num;
			
		} catch (SoldOutException exp) {
			
		}
		
		
	}

}
