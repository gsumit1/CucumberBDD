package RestWebService;

public class TradeDetails {

	private String security;
	private String buySell;
	private String quantity;
	private String priceInCents;

	public TradeDetails(String security, String buySell, String quantity, String priceInCents) {
		this.security = security;
		this.buySell = buySell;
		this.quantity = quantity;
		this.priceInCents = priceInCents;

	}

	public TradeDetails() {
	};

	public String getSecurity() {
		return this.security;
	}

	public String getBuySell() {
		return buySell;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getPriceInCents() {
		return priceInCents;
	}

}
