class PESEL{
	long pesel;
	long[] weight = {1, 3, 7, 9, 1, 3, 7, 9, 1,3};
	public PESEL(long pesel) {
		this.pesel = pesel;
	}
	public PESEL(String str) {
		this.pesel = Long.parseLong(str);
	}
	
	public boolean isCorrect() {
long cyfra;
long l = pesel; 
long sum = 0;
int j = 0;
		
		for(long i=10_000_000_000L; i >= 10; i /= 10) {
			cyfra = l/i;
			l %= i;
			sum += cyfra*weight[j++];
			
		}
		int r = (int) (sum % 10L);
		if(r != 0) r = 10 - r;
		System.out.println("Kontrolna " + r);
		return r== (int) (pesel % 10L);
		
	}
	public boolean isMale() {
		return true;
		
	}
	public String isBorn() {
		return "";
	}
	
	public String toString() {
		String correct = "";
		if(isCorrect()) correct = "TAK";
		else correct = "NIE";
		String sex = "kobieta";
	    if(isMale()) sex = "mężczyzna";
	    return String.format("poprawny: %s, płeć: %s, urodzony: %s"
	    		correct, sex, isBorn());
	    
	    
	}
	
}
public class PeselMain {
	
	public static void main(String[] args) {
		long pesel = 00260902939L;
		PESEL p1 = new PESEL(pesel);
		PESEL p2 = new PESEL("710530045672");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		
				
	}

}
