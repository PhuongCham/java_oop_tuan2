package bai1_7;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int d,int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate(int d,int m,int y) {
		day = d;
		month = m;
		year = y;
	}
	public String toString() {
		String d=""+day;
		String m=""+month;
		if(day<10) d="0"+day;
		if(month<10) m="0"+month;
		return d+"/"+m+"/"+year;
	}
	
}
