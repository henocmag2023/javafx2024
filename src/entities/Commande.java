@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters et setters
}
