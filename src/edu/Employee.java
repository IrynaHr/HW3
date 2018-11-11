package edu;

public class Employee {

	public static int totalSum;

	private String name;
	private int rate;
	private int hour;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public Employee() {
		
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hour) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;
	}

	public int salary() {
		int salary = (rate * hour);
		return salary;
	}

	public int bonus() {
		int bonus = (int) (salary() * 0.1);
		return bonus;
	}

	public int changeRate(int s) {
		totalSum -= (salary() + bonus());
		rate = s;
		totalSum += (salary() + bonus());
		return rate;
	}

	public int totalSum() {
		totalSum += (salary() + bonus());
		return totalSum;
	}

	@Override
	public String toString() {
		return "name = " + name + " rate = " + rate + " hours = " + hour + " salary = " 
				+ salary() + " bonus = " + bonus() + " totalSum = " + totalSum();

	}

}
