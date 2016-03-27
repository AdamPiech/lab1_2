package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public class TaxRate {
	
	private BigDecimal ratio = null;
	private String description = null;
	
	public TaxRate (BigDecimal ratio, String description) {
		this.ratio = ratio;
		this.description = description;
	}

	public BigDecimal getRatio() {
		return ratio;
	}

	public void setRatio(BigDecimal ratio) {
		this.ratio = ratio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
