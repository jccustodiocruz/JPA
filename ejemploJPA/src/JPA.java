
import Entidades.Videogame;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JPA {

    public static void main(String[] args) {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager manager = managerFactory.createEntityManager();

//        manager.getTransaction().begin();
//        Videogame game = new Videogame();
//        game.setName("God of war");
//        game.setRating(9);
//        
//        Achievement achievement = new Achievement();
//        achievement.setName("Level 1");
//        achievement.setVideogame(game);
//        
//        manager.persist(achievement);
//
//        manager.persist(game);
//        manager.getTransaction().commit();
        TypedQuery<Videogame> query = manager.createQuery("SELECT v FROM Videogame v WHERE v.rating = :rating", Videogame.class);
        query.setParameter("rating", 5);
        List<Videogame> list = query.getResultList();
    }
}
