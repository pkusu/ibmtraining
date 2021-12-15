
public class StockSingleton {
	private StockSingleton() {
	}
	public static Stock stk;
		public static Stock getstock() {
			if(stk == null)
				stk = new Stock();
			return stk;

		
	}

}
