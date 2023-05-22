package sam.springcloud.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sam.springcloud.product.model.Product;
import sam.springcloud.product.repository.ProductRepository;

@SpringBootApplication
public class ProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null, "prod1", 67, 119.99));
			productRepository.save(new Product(null, "prod2", 123, 89.99));
			productRepository.save(new Product(null, "prod3", 732, 49.95));
			productRepository.save(new Product(null, "prod4", 236, 69.75));
		};
	}

}
