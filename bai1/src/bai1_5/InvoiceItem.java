package bai1_5;

public class InvoiceItem {
	private String ID;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem(String id,String d,int q,double p) {
		this.ID = id;
		this.desc = d;
		this.qty = q;
		this.unitPrice = p;
	}
	
	public String getId() {
		return ID;
	}
	public String getDesc() {
		return desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal() {
		return unitPrice*qty;
	}
	
	public String toString() {
		return "InvoiceItem[id="+ID+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
	}
	
	
	
	
	
}
