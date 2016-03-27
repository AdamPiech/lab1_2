package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.HashMap;
import java.util.Map;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class TaxService {

	private Map<ProductType, TaxRate> taxRateMap = new HashMap<ProductType, TaxRate>();
	
	public TaxService(Map<ProductType, TaxRate> taxRateMap) {
		this.taxRateMap = taxRateMap;
	}

	public Tax count (RequestItem item) {
		
		Money net = item.getTotalCost();	
		TaxRate rate = taxRateMap.get(item.getProductData().getType());	
		
		if (rate == null) {
			throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
		} 
		
		Money taxValue = net.multiplyBy(rate.getRatio());
		return new Tax(taxValue, rate.getDescription());
	}
}
