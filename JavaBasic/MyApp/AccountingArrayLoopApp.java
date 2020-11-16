
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply * vatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;
		
		
		
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Expense : " + expense );
		System.out.println("Income : " + income );
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[1] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]) );
			i = i + 1;
		}
		
	
	}

}
