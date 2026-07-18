package com.example.dependencyinjectionpracticeapplication.payment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("Phone Pay")// Unique name given to spring bean object
@ConditionalOnProperty(name="payment.type",havingValue = "phone Pay")
public class PhonePayPaymentService implements PaymentServices {
    @Override
    public void payment(){
        System.out.println("Phone Pay Payment loading");
    }
}