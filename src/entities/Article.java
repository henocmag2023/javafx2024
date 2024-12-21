@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomArticle;
    private double prix;
    private int quantiteDisponible;

    // Getters et setters
}
