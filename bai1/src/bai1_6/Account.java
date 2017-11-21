package bai1_6;

public class Account {
	private String ID;
	private String name;
	private int balance;
	
	public Account(String id,String n) {
		this.ID = id;
		this.name= n;
		this.balance =0;
	}
	public Account(String id,String n, int b) {
		this.ID = id;
		this.name= n;
		this.balance = b;
	}
	
	public String getId() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount<=balance) balance-=amount;
		return balance;
	}
	public int transferTo(Account another,int amount) {
	if(amount<=this.balance) {
		another.balance+=amount;
		this.balance-=amount;
	}
	else System.out.print("Amount exceeded balance");
	return this.balance;
}
	public String toString() {
		return "Account[id="+ID+",name="+name+",balance="+balance+"]";
	}
	
	
}
