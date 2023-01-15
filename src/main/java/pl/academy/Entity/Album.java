package pl.academy.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="performer")
    private String performer;
    @Column(name="title")
    private String title;
    @OneToMany(mappedBy = "album")
    List<Tracks> tracks=new ArrayList<>();
    public Album(Long id, String performer, String title, List<Tracks> tracks) {
        this.id = id;
        this.performer = performer;
        this.title = title;
        this.tracks = tracks;
    }
    public Album() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPerformer() {
        return performer;
    }
    public void setPerformer(String performer) {
        this.performer = performer;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Tracks> getTracks() {
        return tracks;
    }
    public void setTracks(List<Tracks> tracks) {
        this.tracks = tracks;
    }
}

