package finalProject;

public class Nuts extends Item {

	private final static int cost = 90;
	private static int numberOfNuts =80;
	private int num ;
	Inventory x =new Inventory();
	public Nuts ( int number) {
		
		this.num=number;
		 numberOfNuts -= this.num;
		
		try {
			x.inventoryOfNuts(numberOfNuts);
			
		} catch (SoldOutException exp) {
			 System.out.println(exp);
			 numberOfNuts=0;
		}
		
	}

	@Override
	public int getCost() {
		
		try {
			x.inventoryOfNuts( numberOfNuts );
			return this.num*cost;
		}
		catch (SoldOutException exp) {
			 return 0;
		}

	}

	@Override
	public void print() {
		try {
			x.inventoryOfNuts( numberOfNuts );
			System.out.println(" Nuts :"+ "    "+ this.num +"      " + this.getCost());
			
		}
		catch (SoldOutException exp) {
			 
		}
		
		
		
	}

	@Override
	public void showInventory() {
		System.out.println(" No of Nuts :" + "    "+ numberOfNuts  );		
	}

	@Override
	public void cancel() {
		try {
			x.inventoryOfNuts(numberOfNuts);
			numberOfNuts += this.num;
			
		} catch (SoldOutException exp) {
			
		}
		
	}
	
	
}
