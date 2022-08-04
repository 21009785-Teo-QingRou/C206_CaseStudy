
public class Currency {

	// field
	public String iso_Code;
	public String name;
	public double buy_Rate;
	public double sell_Rate;
	
	// constructor
	public Currency(String iso_Code, String name, double buy_Rate, double sell_Rate) {
		super();
		this.iso_Code = iso_Code;
		this.name = name;
		this.buy_Rate = buy_Rate;
		this.sell_Rate = sell_Rate;
	}

	//Getter & Setter method
	public String getIso_Code() {
		return iso_Code;
	}

	public void setIso_Code(String iso_Code) {
		this.iso_Code = iso_Code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBuy_Rate() {
		return buy_Rate;
	}

	public void setBuy_Rate(double buy_Rate) {
		this.buy_Rate = buy_Rate;
	}

	public double getSell_Rate() {
		return sell_Rate;
	}

	public void setSell_Rate(double sell_Rate) {
		this.sell_Rate = sell_Rate;
	}

}
