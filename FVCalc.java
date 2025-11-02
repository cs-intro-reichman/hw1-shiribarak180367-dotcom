// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
	int currentValue = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);
	rate /= 100.0;
	double factor = Math.pow(1.0 + rate, (double)years);
	double futureValue = (double)currentValue * factor;
	System.out.println("after " + years + " years, $" + currentValue + " saved at " + (rate * 100) + "% will yield $" + (int)futureValue);
	}
}
	