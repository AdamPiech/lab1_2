package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.Map;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;

public class TaxServiceFactory implements ITaxServiceFactory {

	Map<ProductType, TaxRate> taxRateMap;
	
	public TaxServiceFactory(Map<ProductType, TaxRate> taxRateMap) {
		this.taxRateMap = taxRateMap;
	}

	public TaxService create() {
		return new TaxService(taxRateMap);
	}
}
