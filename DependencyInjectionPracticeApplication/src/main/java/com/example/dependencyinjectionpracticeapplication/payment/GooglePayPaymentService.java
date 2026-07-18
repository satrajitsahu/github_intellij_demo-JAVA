package com.example.dependencyinjectionpracticeapplication.payment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Qualifier("Google Pay")// Unique name given to spring bean object
@ConditionalOnProperty(name="payment.type",havingValue = "Google Pay")
public class GooglePayPaymentService implements PaymentServices {
    @Override
    public void payment(){
        System.out.println("Google Pay Payment loading");
    }
}
