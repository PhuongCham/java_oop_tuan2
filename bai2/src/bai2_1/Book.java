package bai2_1;

public class Book extends Author{
	String name;
	Author author;
	double price;
	int qty;
	public Book(String name,Author author,double price) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
	public Book(String name,Author author,double price,int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "Book[name="+this.name+"author={Author[name="+author.name+",email="+author.email+",gender="+author.gender+"},price="+price+",qty="+qty+"]";
	}
}
