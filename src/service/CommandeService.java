public class CommandeService {
    private CommandeRepository commandeRepository;
    private ArticleRepository articleRepository;

    public CommandeService(CommandeRepository commandeRepository, ArticleRepository articleRepository) {
        this.commandeRepository = commandeRepository;
        this.articleRepository = articleRepository;
    }

    public void ajouterArticleCommande(Commande commande, Article article, int quantite, double prix) {
        if (article.getQuantiteDisponible() >= quantite) {
            ArticleCommande articleCommande = new ArticleCommande();
            articleCommande.setCommande(commande);
            articleCommande.setArticle(article);
            articleCommande.setQuantite(quantite);
            articleCommande.setPrix(prix);

            // Sauvegarder dans la base de données
            commandeRepository.saveArticleCommande(articleCommande);

            // Mettre à jour la quantité disponible
            article.setQuantiteDisponible(article.getQuantiteDisponible() - quantite);
            articleRepository.update(article);
        } else {
            throw new IllegalArgumentException("Quantité non disponible !");
        }
    }
}
