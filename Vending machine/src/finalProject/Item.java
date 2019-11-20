package finalProject;


public abstract class Item {

	
	protected String name;
	
	/*public Item() {
	    this("");
	  }
	 public Item(String name) {
		    
		      this.name = name;
		   
		  }
	 public final String getName() {
		    return name;
		  }*/
	 
	 public abstract int getCost();
	 
	public abstract void print();
	
	public abstract void cancel();
	
	public abstract void showInventory();
}
