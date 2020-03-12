package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.ManyToOne;

@Entity
public class Achievement extends EntityBase implements Serializable {

    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    private Videogame videogame;

    public Videogame getVideogame() {
        return videogame;
    }

    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }
}
