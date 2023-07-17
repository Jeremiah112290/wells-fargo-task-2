import javax.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisorID;
    
    @Column(nullable = false)
    private String advisorName;
    
    // Other attributes
    
    public FinancialAdvisor() {
        // Empty constructor for JPA
    }
    
    public FinancialAdvisor(String advisorName) {
        this.advisorName = advisorName;
        // Initialize other attributes if applicable
    }
    
    // Getters and setters
    // Omitting getters/setters for other attributes
    public int getAdvisorID() {
        return advisorID;
    }
    
    public String getAdvisorName() {
        return advisorName;
    }
    
    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }
}
