package sam.springcloud.billing;

import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sam.springcloud.billing.feign.CustomerRestClient;
import sam.springcloud.billing.feign.ProductItemRestClient;
import sam.springcloud.billing.model.Customer;
import sam.springcloud.billing.repository.BilliRepository;


@SpringBootApplication
@EnableFeignClients
@ToString
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BilliRepository billiRepository,
                            CustomerRestClient customerRestClient,
                            ProductItemRestClient productRestClient
    ) {
        return args -> {
            Customer customer = customerRestClient.getCustomerById(1L);
            System.out.println("-------------------- ");
            System.out.println(customer.toString());

        };
    }
}
