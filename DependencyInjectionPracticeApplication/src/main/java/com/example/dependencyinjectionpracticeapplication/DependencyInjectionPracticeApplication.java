package com.example.dependencyinjectionpracticeapplication;
import com.example.dependencyinjectionpracticeapplication.payment.PaymentService;
import com.example.dependencyinjectionpracticeapplication.payment.PaymentServices;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DependencyInjectionPracticeApplication implements CommandLineRunner {

//    @Autowired //1st way to Field dependency injection
//    PaymentServices paymentService;

    final PaymentServices paymentServices;

    //2nd way to inject dependency is Constructor Dependency Injection
    // use of @Qualifier() to decide the priority
    //limitation of @Primary annotations is removed with @Quantifier annotation
      public DependencyInjectionPracticeApplication(PaymentServices paymentServices) {
      this.paymentServices = paymentServices;
   }
   @Autowired
   Map<String,PaymentServices> beans=new HashMap<>();
    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionPracticeApplication.class, args);
    }

    @Override
    public void run(String ... args) throws Exception {
        //paymentServices.payment();
        for(Map.Entry<String,PaymentServices>bean:beans.entrySet()){
            System.out.println(bean);
        }
    }
}
