
public class AccountingMethodApp {

	public static double ValueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		ValueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();
	}

	public static void print() {
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + getVAT() );
		System.out.println("Total : " + getTotal() );
		System.out.println("Expense : " + getExpense() );
		System.out.println("Income : " + getIncome() );
		System.out.println("Dividend 1 : " + getDiviend1() );
		System.out.println("Dividend 2 : " + getDiviend2() );
		System.out.println("Dividend 3 : " + getDiviend3()  );
	}

	public static double getDiviend1() {
		return getIncome() * 0.5;
	}
	
	public static double getDiviend2() {
		return getIncome() * 0.3;
	}
	
	public static double getDiviend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return ValueOfSupply - getExpense();
	}

	public static double getExpense() {
		return ValueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return ValueOfSupply + getVAT();
	}

	private static double getVAT() {
		return ValueOfSupply * vatRate;
	}
}
