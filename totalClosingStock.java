package softwareDesignCode;

public class totalClosingStock implements openingStock {
	private int price;
	private int unit;
	private String itemCode;
	private String itemName;
	
	
    public totalClosingStock(String name, String itemId) {
        this.itemName=name;
        this.itemCode=itemId;
        this.unit=0;
    }
	
	  public void add() {
	        this.unit++;
	    }

	    public void remove() {
	        this.unit--;
	    }
	
	
	public String getItemCode() {
	     return this.itemCode;
	  }

	 public String getItemName() {
	     return this.itemName;
	  }
	 
	public int getPrice() {
	     return this.price;
	  }

	 public int getUnit() {
	     return this.unit;
	  }
	 
	   public String toString() {
	        String s="";
	        s+=" name = "+this.itemName;
	        s+=" , code = "+this.itemCode;
	        s+=" , unit = "+this.unit;
	        return s;
	    }
	 
	@Override
	public void totalStockValue() {
		System.out.println(price*unit);
	}

	
}

