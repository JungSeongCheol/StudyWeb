class Accounting{
	public double ValueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total : " + getTotal() );
		System.out.println("Expense : " + getExpense() );
		System.out.println("Income : " + getIncome() );
		System.out.println("Dividend 1 : " + getDiviend1() );
		System.out.println("Dividend 2 : " + getDiviend2() );
		System.out.println("Dividend 3 : " + getDiviend3()  );
	}

	public double getDiviend1() {
		return getIncome() * 0.5;
	}
	
	public double getDiviend2() {
		return getIncome() * 0.3;
	}
	
	public double getDiviend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return ValueOfSupply - getExpense();
	}

	public double getExpense() {
		return ValueOfSupply * expenseRate;
	}

	public double getTotal() {
		return ValueOfSupply + getVAT();
	}

	private double getVAT() {
		return ValueOfSupply * vatRate;
	}
}

public class AccountingClassApp {
	public static void main(String[] args) {
//		Accounting.ValueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		//...
//		Accounting.print();
//		//...
//		Accounting.ValueOfSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
//		Accounting.print();
//		//...
		
		// instance
		Accounting a1 = new Accounting();
		a1.ValueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.ValueOfSupply = 10000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.3;
		a2.print();
		
		a1.print();
	}
}
