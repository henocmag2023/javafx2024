public class ClientRepository {
    private Session session;

    public ClientRepository(Session session) {
        this.session = session;
    }

    public Client findByTelephone(String telephone) {
        Query<Client> query = session.createQuery("FROM Client WHERE telephone = :telephone", Client.class);
        query.setParameter("telephone", telephone);
        return query.uniqueResult();
    }

    // Autres méthodes (CRUD)
}
