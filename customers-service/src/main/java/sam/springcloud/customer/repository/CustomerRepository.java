package sam.springcloud.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sam.springcloud.customer.model.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
