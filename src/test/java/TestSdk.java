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
        config.put("clientId", "8a8351ab-97f9-42a5-972f-21de8612d4ae");
        config.put("secret", "4eb2f11fd7fd5989c22c3f3f5492bd72ac5c8213b5cdec0cabfbc0f6868ed136");
        config.put("verifySSL", false);
        ChainsideClient client = new ChainsideClient(config);

        PaymentOrderCreation paymentOrder = new PaymentOrderCreation();
        paymentOrder.setAmount("10.00");
        paymentOrder.setReference("#1");
        paymentOrder.setDetails("#1det");
        paymentOrder.setRequiredConfirmations(3);
        PaymentOrderCreationResponse resp = client.createPaymentOrder(paymentOrder);

    }

    @Test
    public void TestCallbackHandler(){

    }
}
