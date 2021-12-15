
public class TestStock {
	public static void main(String[] args) {
		
		Holder h= StockSingleton.getstock();
		h.viewQuote();
		
		Broker b= StockSingleton.getstock();
		b.getQuote();
		
		System.out.println(h == b);
	}

}
