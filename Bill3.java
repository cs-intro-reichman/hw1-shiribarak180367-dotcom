// Splits a restaurant bill evenly among three diners.
public class Bill3 {
		// To get you started, here is the first line in the program:
	   public static void main(String[] args) {
      String var1 = args[0];
      String var2 = args[1];
      String var3 = args[2];
      int var4 = Integer.parseInt(args[3]);
      double var5 = Math.ceil((double)var4 / 3.0);
      String var7 = "dear " + var3 + ", " + var2 + ", and " + var1 + ": pay " + var5 + " Shekels each.";
      System.out.println(var7);
		
	}
}
