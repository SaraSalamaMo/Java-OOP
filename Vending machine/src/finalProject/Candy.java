package finalProject;

public class Candy extends Item {

	private final static int  cost =10;
	private static int numberOfCandy =65;
    private int num ;
    Inventory x = new Inventory();
    
	public Candy( int number) {
		
		this.num=number;
		 numberOfCandy -= this.num;
		
		try {
			x.inventoryOfCandy(numberOfCandy );
			
		} catch (SoldOutException exp) {
			 System.out.println(exp);
			 numberOfCandy=0;
		}
		
	}
	
	@Override
	public int getCost() {
		
		try {
			x.inventoryOfCandy(numberOfCandy );
			return this.num*cost;
		}
		catch (SoldOutException exp) {
			 return 0;
		}
	}

	@Override
	public void print() {
		try {
			x.inventoryOfCandy(numberOfCandy );
			System.out.println(" candy:" + "    "+ this.num +"      " + this.getCost());
			
		}
		catch (SoldOutException exp) {
			 
		}
		
		
		
	}

	@Override
	public void showInventory() {
		System.out.println(" No of Candy :" + "    "+ numberOfCandy  );
		
	}

	@Override
	public void cancel() {
		try {
			x.inventoryOfCandy(numberOfCandy);
			numberOfCandy += this.num;
			
		} catch (SoldOutException exp) {
			
		}
		
	}

	
}
