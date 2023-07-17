import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientID;
    
    @Column(nullable = false)
    private String clientName;
    
    // Other attributes
    
    public Client() {
        // Empty constructor for JPA
    }
    
    public Client(String clientName) {
        this.clientName = clientName;
        // Initialize other attributes if applicable
    }
    
    // Getters and setters
    // Omitting getters/setters for other attributes
    public int getClientID() {
        return clientID;
    }
    
    public String getClientName() {
        return clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
