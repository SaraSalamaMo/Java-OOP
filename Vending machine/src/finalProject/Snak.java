package finalProject;

public class Snak extends Item{
	
	private final static int  cost =50;
	private static int numberOfSnak =50;
    private int num ;
    Inventory x =new Inventory();
	public Snak(int number) {
		this.num=number;
		numberOfSnak-=this.num;
		try {
			x.inventoryOfSnak(numberOfSnak);
			
		} catch (SoldOutException exp) {
			 System.out.println(exp);
			 numberOfSnak=0;
		}
	}

	@Override
	public int getCost() {
		try {
			x.inventoryOfSnak(numberOfSnak);
			return this.num*cost;
		}
		catch (SoldOutException exp) {
			 return 0;
		}
	}

	@Override
	public void print() {
		try {
			x.inventoryOfSnak(numberOfSnak);
			System.out.println(" Snak :" + "    "+ this.num +"      " + this.getCost());
			
		}
		catch (SoldOutException exp) {
			 
		}
		
		
	}

	@Override
	public void showInventory() {
		System.out.println(" No of Snak :" + "    "+ numberOfSnak  );
		
	}

	@Override
	public void cancel() {
		try {
			x.inventoryOfSnak(numberOfSnak);
			numberOfSnak += this.num;
			
		} catch (SoldOutException exp) {
			
		}
		
	}

}
