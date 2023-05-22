package sam.springcloud.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sam.springcloud.product.model.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
}
