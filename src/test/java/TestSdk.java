import com.sdkboilerplate.exceptions.ConfigurationException;

import org.junit.Test;

import org.webpossdk.api.ChainsideClient;
import org.webpossdk.objects.PaymentOrderCreation;
import org.webpossdk.objects.PaymentOrderCreationResponse;

import java.util.*;


public class TestSdk {
    public TestSdk() {
    }

    @Test
    public void TestClientLogin() throws ConfigurationException, Exception {

        HashMap<String, Object> config = new HashMap<>();
        config.put("mode", "live");
        config.put("clientId", "ca486cd8-0af6-4b1d-833c-11f640978d19");
        config.put("secret", "54104ad9ddef9511905d295c0c384e1507bf011dc4e7aad4d40d2434e2d6f2c6");

        ChainsideClient client = new ChainsideClient(config);

        PaymentOrderCreation paymentOrder = new PaymentOrderCreation();
        paymentOrder.setAmount("10.00");
        paymentOrder.setReference("#1");
        paymentOrder.setDetails("#1det");
        paymentOrder.setRequiredConfirmations(3);
        PaymentOrderCreationResponse resp = client.createPaymentOrder(paymentOrder);

    }
}
