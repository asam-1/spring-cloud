package sam.springcloud.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sam.springcloud.billing.entities.Bill;

@RepositoryRestResource
public interface BilliRepository extends JpaRepository<Bill, Long> {

}
