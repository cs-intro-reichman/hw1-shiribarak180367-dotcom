// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
	int currentValue = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);
	rate = rate / 100;
	double factor = Math.pow(1 + rate, years);
	double futureValue = (currentValue * factor);
	System.out.println("after " + years + " years, " + "saved at " + rate + "% will yield $" + (int)futureValue);
	}
}
	