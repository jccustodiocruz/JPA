package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Player extends EntityBase implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "player", cascade = CascadeType.PERSIST)
    private Collection<Videogame> videogames;

    public Collection<Videogame> getVideogames() {
        return videogames;
    }

    public void setVideogames(Collection<Videogame> videogames) {
        this.videogames = videogames;
    }

    public Player() {
        this.videogames = new HashSet();
    }

    public void addVideogame(Videogame v) {
        videogames.add(v);
    }
}
