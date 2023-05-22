package sam.springcloud.billing.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import sam.springcloud.billing.entities.Bill;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
    private Long id;
    private String name;
    private int quantity;
    private  double price;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
