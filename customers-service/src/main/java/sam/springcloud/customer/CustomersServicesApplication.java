package sam.springcloud.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sam.springcloud.customer.model.Customer;
import sam.springcloud.customer.repository.CustomerRepository;

@SpringBootApplication
public class CustomersServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersServicesApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository,
							RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Customer.class);
		return args -> {
			customerRepository.save(new Customer(null, "custom1", "mail1@mail.com"));
			customerRepository.save(new Customer(null, "custom2", "mail2@mail.com"));
			customerRepository.save(new Customer(null, "custom3", "mail3@mail.com"));
			customerRepository.save(new Customer(null, "custom4", "mail4@mail.com"));
		};
	}

}
