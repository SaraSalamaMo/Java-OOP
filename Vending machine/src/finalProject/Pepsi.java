package finalProject;

public class Pepsi extends Item {

	private final static int cost = 35;
	private static int numberOfPepsi =70;
	private int num ;
	Inventory x =new Inventory();
	public Pepsi(int number) {

		this.num=number;
		numberOfPepsi-=this.num;
		try {
			x.inventoryOfPepsi(numberOfPepsi);
			
		} catch (SoldOutException exp) {
			 System.out.println(exp);
			 numberOfPepsi=0;
		}

	}

	@Override
	public int getCost() {
		
		try {
			x.inventoryOfPepsi(numberOfPepsi);
			return this.num*cost;
		}
		catch (SoldOutException exp) {
			 return 0;
		}
	}

	@Override
	public void print() {
		try {
			x.inventoryOfPepsi(numberOfPepsi);
			System.out.println(" Pepsi:" + "    "+ this.num +"      " + this.getCost());
			
		}
		catch (SoldOutException exp) {
			 
		}
		
		
		
	}

	@Override
	public void showInventory() {
		System.out.println(" No of Pepsi :" + "    "+ numberOfPepsi  );		
	}

	@Override
	public void cancel() {
		try {
			x.inventoryOfSoda(numberOfPepsi);
			numberOfPepsi += this.num;
			
		} catch (SoldOutException exp) {
			
		}
		
		
	}

}
