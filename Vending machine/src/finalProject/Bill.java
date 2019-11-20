package finalProject;

import java.util.ArrayList;


public class Bill {

    private ArrayList <Item> b=new ArrayList <Item>() ;
	
	
	public void enterItem(Item item) {
		 b.add(item);
	}
	
	public int totalCost()
	{
		int cost=0;
		for (int i=0; i<b.size(); i++) {
			cost+=(b.get(i).getCost());
		}
		
		return cost;
	}
	
	public void clear() {
		b.clear();
	}
	public  void print() {
		
		int cost=0;
		for (int i=0; i<b.size(); i++) {
			cost+=(b.get(i).getCost());
			
		}
		
		System.out.println("(Items)" + " "+ "(number)" + ""+"(cost by cent)");
		for (int i=0; i<b.size();i++) {
			b.get(i).print();
		}
		System.out.println("Total cost: " + cost + " cents"+"\n");
	}
	
	
	
   public void cancel () {
		
		
		for (int i=0; i<b.size();i++) {
			b.get(i).cancel();
		}
		 System.out.println("Order is canceled");
	}
		
	
}
