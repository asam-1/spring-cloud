package sam.springcloud.billing.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sam.springcloud.billing.model.Customer;


import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @Transient
    private Customer customer;
    @Transient
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productList;
    private long customerId;

}
