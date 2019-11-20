package finalProject;
import java.util.ArrayList;

public class VendingMachine {

	private ArrayList< Coin> currency = new ArrayList <Coin>() ;
	private int coinsInMachine = 500 ;
	
	public void insertCoin (Coin coin) {
		this.currency.add(coin);
		
	}
	
	public int getTotalCoinsInsreted ( ) {
		int total =0;
		
		for (int i=0; i<this.currency.size(); i++) {
			total += this.currency.get(i).value(); 
			
		}
		return total;
	}
	
	public void sufficientPaid (int cost , int cash ) throws NotSufficientPaidException, NoChangeAvailableException {
		
		 if (cost == cash) {
			 System.out.println("Full paid ...");
	        }
	        
	        if (cost < cash) {
	        	int x = cash - cost ;
	        	if (coinsInMachine < x ) {
	    			throw new NoChangeAvailableException (" No Change Available, please try to insert the exact money ");
	    		}
	        	else {
	        		coinsInMachine -=x;
	        		System.out.println("you paid "+(cash)+" cents and the rest of your money is " + x + " cents" );
	        	}
	        		
	        }
	        
	        if (cost > cash) {
	        	throw new NotSufficientPaidException (" you need to insert " + (cost-cash) +" cents or your order will be cancelled");
	        }
		
	}
	

	
	
	public static void main(String[] args) {
		
        Bill bill = new Bill();
        Inventory inventory =new Inventory();
        VendingMachine v = new VendingMachine();
        
        System.out.println();
        System.out.println("1st test");
        inventory.showInventory();
	    bill.enterItem(new Candy(2));
	    bill.enterItem(new Pepsi(1));
	    bill.enterItem(new Snak(5));
	    bill.enterItem(new Soda(7));
	    bill.enterItem(new Nuts(4));
	    bill.enterItem(new Coke(20));
	    
	    System.out.println();
	    System.out.println("Total cost: " +(bill.totalCost()) + " cents"+"\n");
	    

	    v.insertCoin(Coin.DIME);
        v.insertCoin(Coin.NICKLE);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.DOLLAR);
        System.out.println("Total Inserted money: " +v.getTotalCoinsInsreted()+ " cents");
        
        try {
			v.sufficientPaid(bill.totalCost(), v.getTotalCoinsInsreted());
			
		}
        catch (NotSufficientPaidException exp) {
        	 System.out.println(exp);
			
		}
        catch (NoChangeAvailableException exp) {
       	 System.out.println(exp);
			
		}

	    System.out.println();
	    bill.print();
	    
	    bill.clear();
	    ////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println();
	    System.out.println("2nd test");
	    bill.enterItem(new Candy(2));
	    bill.enterItem(new Pepsi(10));
	    bill.enterItem(new Snak(5));
	    bill.enterItem(new Soda(1));
	    bill.enterItem(new Nuts(4));
	    bill.enterItem(new Coke(2));
	    
	    System.out.println();
	    System.out.println("Total cost: " +(bill.totalCost()) + " cents"+"\n");
	   
	    
	    v.insertCoin(Coin.DIME);
        v.insertCoin(Coin.NICKLE);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.DOLLAR);
        System.out.println("Total Inserted money: " +v.getTotalCoinsInsreted()+ " cents");
        
        try {
			v.sufficientPaid(bill.totalCost(), v.getTotalCoinsInsreted());
			
		}
        catch (NotSufficientPaidException exp) {
        	 System.out.println(exp);
			
		}
        catch (NoChangeAvailableException exp) {
       	 System.out.println(exp);
			
		}

	    System.out.println();
	    bill.print();
	    
	    bill.clear();
	    
	    /////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println();
	    System.out.println("3rd test");
	    
	    bill.enterItem(new Candy(2));
	    bill.enterItem(new Pepsi(1));
	    bill.enterItem(new Snak(50));
	    bill.enterItem(new Soda(70));
	    bill.enterItem(new Nuts(4));
	    bill.enterItem(new Coke(20));
	    
	    System.out.println();
	    System.out.println("Total cost: " +(bill.totalCost()) + " cents"+"\n");
	    
	    
	    v.insertCoin(Coin.DIME);
        v.insertCoin(Coin.NICKLE);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.TWODOLLAR);
        v.insertCoin(Coin.DOLLAR);
        System.out.println("Total Inserted money: " +v.getTotalCoinsInsreted()+ " cents");
        
        try {
			v.sufficientPaid(bill.totalCost(), v.getTotalCoinsInsreted());
			
		}
        catch (NotSufficientPaidException exp) {
        	 System.out.println(exp);
			
		}
        catch (NoChangeAvailableException exp) {
       	 System.out.println(exp);
			
		}
        

        bill.print();
	    System.out.println();
	   inventory.showInventory();
	    bill.cancel();
	    System.out.println();
	    inventory.showInventory();
	    bill.clear();
	    

	}

}
