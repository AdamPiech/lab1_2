package pl.com.bottega.ecommerce.sales.domain.factory;

import pl.com.bottega.ecommerce.sales.domain.invoicing.IInvoiceFactory;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceFactory;
import pl.com.bottega.ecommerce.sales.domain.payment.IPaymentFactory;
import pl.com.bottega.ecommerce.sales.domain.payment.PaymentFactory;

public class MainFactory {

	public static IPaymentFactory getIPaymentFactory() {
		return new PaymentFactory();
	}
	
	public static IInvoiceFactory getIIvoiceFactory() {
		return new InvoiceFactory();
	}
}
