
import Entidades.Videogame;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPA {

    
    public static void main(String[] args) {
        
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager manager = managerFactory.createEntityManager();
        
        manager.getTransaction().begin();
        Videogame game = new Videogame();
        game.setName("God of war");
        game.setRating(9);
        
        manager.persist(game);
        manager.getTransaction().commit();
    }
    
}
