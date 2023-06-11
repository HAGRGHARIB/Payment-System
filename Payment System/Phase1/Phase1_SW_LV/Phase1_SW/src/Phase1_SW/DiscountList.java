package Phase1_SW;

import java.util.LinkedList;

public class DiscountList {
     static Discount discount;
    protected LinkedList<Discount> listDiscount = new LinkedList<Discount>();
    public LinkedList<Discount> getDiscount() {
		return listDiscount;	
    }
     public void AddDiscount( Discount discount) {
    	listDiscount.add(discount);
    	
    }
}