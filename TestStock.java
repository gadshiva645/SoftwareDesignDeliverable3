package softwareDesignCode;

import java.util.ArrayList;

public class TestStock {

	
	    private ArrayList<totalClosingStock> stock = new ArrayList<totalClosingStock>();

	    public TestStock() {
	        this.stock.add(new totalClosingStock("Book", "42742974297"));
	        this.stock.add(new totalClosingStock("Pen", "5353983553"));
	    }
	
	    
	    public void addStock(String name) {
	        for (totalClosingStock item : this.stock) {
	            if (name.equals(item.getItemName())) {
	                item.add();
	                return;
	            }
	        }
	    }
		    
	    
	    public void removeStock(String name) {
	        for (totalClosingStock item : this.stock) {
	            if (name.equals(item.getItemName())) {
	                if (item.getUnit()>=0) {
	                    item.remove();
	                }
	                return;
	            }
	        }
	    }
	    
	    
	    public void createStock(String name, String itemId) {
	        this.stock.add(new totalClosingStock(name,itemId));
	    }
		    
	    
	    public String toString() {
	        String s="";
	        s+="TotalClosingStock contains:\n";
	        for (totalClosingStock item:this.stock) {
	            s+='\t'+item.toString();
	        }
	        return s;
	    }
	    
	    public void printStock() {
	        System.out.println(this.toString());
	    }
		    
	    
	    public static void main(String[] args) {	    	
	    	TestStock testStock = new TestStock();
	    	testStock.printStock();
	    	testStock.addStock("Book");
	    	testStock.addStock("Book");
	    	testStock.addStock("Book");
	    	testStock.addStock("Pen");
	    	testStock.printStock();
	    	testStock.removeStock("Book");
	    	testStock.printStock();
	    	testStock.createStock("Pencil", "92827234534");
	    	testStock.printStock();
	    	testStock.addStock("Pencil");
	    	testStock.printStock();
	    }		  
	
}



