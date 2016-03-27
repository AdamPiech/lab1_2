package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public interface IPaymentFactory {
	Payment create(ClientData client, Money amount);
}
