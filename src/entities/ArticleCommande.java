@Entity
@Table(name = "article_commande")
public class ArticleCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    private double prix;
    private int quantite;

    // Getters et setters
}
