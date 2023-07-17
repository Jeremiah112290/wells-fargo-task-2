import javax.persistence.*;

import org.apache.poi.ss.formula.functions.Columns;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int securityID;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String category;
    
    Columns(nullable = false)
    private String purchaseDate;
    
    @Column(nullable = false)
    private double purchasePrice;
    
    @Column(nullable = false)
    private int quantity;
    
    public Security() {
        // Empty constructor for JPA
    }
    
    public Security(String name, String category, String purchaseDate, double purchasePrice, int quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }
    
    // Getters and setters
    // Omitting getters/setters for other attributes
    public int getSecurityID() {
        return securityID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Other getters and setters for remaining attributes
}
