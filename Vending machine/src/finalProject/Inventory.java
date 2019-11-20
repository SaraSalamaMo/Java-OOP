package finalProject;

import java.util.ArrayList;

public class Inventory{
	
	private ArrayList <Item> inv = new ArrayList <Item>() ;
	private int x=0;
	
	public void enterItem(Item item) {
		 inv.add(item);
	}
	    
	
	
	public  void inventoryOfSoda  (int nSoda) throws SoldOutException {
		
			if(nSoda<=0)
				throw new SoldOutException("Soda is sold out");
		
	}
	
     public  void inventoryOfCoke  (int nCoke) throws SoldOutException {
		
			if(nCoke<=0)
				throw new SoldOutException("Coke is sold out");
		}
		

     public  void inventoryOfCandy  (int nCandy) throws SoldOutException {
 		
 			if(nCandy<=0)
 				throw new SoldOutException("Candy is sold out");		
 	}
     
     public  void inventoryOfNuts  (int nNuts)throws SoldOutException {
  		
  			if(nNuts<=0)
  				throw new SoldOutException("Nuts are sold out");
  	}
     
     public  void inventoryOfPepsi (int nPepsi)throws SoldOutException {
 		
   			if(nPepsi<=0)
   				throw new SoldOutException("Pepsi is sold out");
   	}
     
     public  void inventoryOfSnak (int nSnak)throws SoldOutException {
    		
    	    if(nSnak<=0)
    				throw new SoldOutException("Snak is sold out");	
    	}
     
    


 	public void showInventory() {
 		
 		if (x==0) {
 			enterItem(new Candy(0));
 			enterItem(new Coke(0));
 			enterItem(new Nuts(0));
 			enterItem(new Pepsi(0));
 			enterItem(new Snak(0));
 			enterItem(new Soda(0));
 			x=1;
 		}
 		
 		for (int i=0; i<inv.size();i++) {
 			inv.get(i).showInventory();
 		}	
 	}
 	
 	
     
	

}
