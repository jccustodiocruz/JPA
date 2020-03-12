package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Videogame extends EntityBase implements Serializable {

    @Column(nullable = false)
    private int rating;

    @ManyToMany(mappedBy = "videogames", cascade = CascadeType.PERSIST)
    private Collection<Player> players;

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "videogame", cascade = CascadeType.PERSIST)
    private Collection<Achievement> achievements;

    public Collection<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(Collection<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Videogame() {
        this.achievements = new HashSet();
        this.players = new HashSet();
    }

    public void addAchievement(Achievement a) {
        a.setVideogame(this);
        this.achievements.add(a);
    }
}
