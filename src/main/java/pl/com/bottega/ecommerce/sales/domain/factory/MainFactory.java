package pl.com.bottega.ecommerce.sales.domain.factory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import pl.com.bottega.ecommerce.sales.domain.invoicing.IInvoiceFactory;
import pl.com.bottega.ecommerce.sales.domain.invoicing.ITaxServiceFactory;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceFactory;
import pl.com.bottega.ecommerce.sales.domain.invoicing.TaxRate;
import pl.com.bottega.ecommerce.sales.domain.invoicing.TaxServiceFactory;
import pl.com.bottega.ecommerce.sales.domain.payment.IPaymentFactory;
import pl.com.bottega.ecommerce.sales.domain.payment.PaymentFactory;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;

public class MainFactory {

	public static IPaymentFactory getIPaymentFactory() {
		return new PaymentFactory();
	}
	
	public static IInvoiceFactory getIIvoiceFactory() {
		return new InvoiceFactory();
	}
	
	public static ITaxServiceFactory getITaxServiceFactory() {
		Map<ProductType, TaxRate> taxRateMap = new HashMap<ProductType, TaxRate>(); 
		taxRateMap.put(ProductType.DRUG, new TaxRate(BigDecimal.valueOf(0.05), "5% (D)"));
		taxRateMap.put(ProductType.FOOD, new TaxRate(BigDecimal.valueOf(0.07), "7% (F)"));
		taxRateMap.put(ProductType.STANDARD, new TaxRate(BigDecimal.valueOf(0.23), "23%"));
		return new TaxServiceFactory(taxRateMap);
	}
}
