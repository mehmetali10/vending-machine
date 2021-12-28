public class Machine {
	private Item[][] items;
	
	public Machine(Item[][] items) {
	 this.items= new Item[items.length][items[0].length];
		for(int row=0; row<items.length; row++) {
			for(int col=0; col<items[row].length; col++) {
				this.items[row][col] = new Item(items[row][col]);
			}
		}
	}
	
	public Item getItem(int row, int col) {
		return new Item(this.items[row][col]);
	}
	
	public void setItem(Item items, int row, int spot) {
        this.items[row][spot] = new Item(items);
    }
	

	public boolean dispense(int row, int spot) {
		if(this.items[row][spot].getQuantity()>0) {
			this.items[row][spot].setQuantity(this.items[row][spot].getQuantity()-1); //decrases its quantity by one
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String temp ="\t\t************************************************\n";
       for(int row=0; row<items.length; row++) {
    	   temp += "\t";
    	   for(int col=0; col<items[0].length; col++) {
    		   if(items[row][col]==null) {
    			   continue;
    		   } else {
        		   temp += this.items[row][col] + "";
    		   }
    	   }
    	   temp += "\n\n";
       }
       temp += "\t\t************************************************";
		return temp;
	}
	
	
	
}