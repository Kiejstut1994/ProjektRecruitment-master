package pl.academy.Entity;

import org.hibernate.engine.profile.Fetch;

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
    @Column(name="edition")
    private String edition;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "album_tracks",
            joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "tracks_id"))

    private List<Tracks> tracks = new ArrayList<>();
    public Album() {
    }

    public Album(Long id, String performer, String title, String edition, List<Tracks> tracks) {
        this.id = id;
        this.performer = performer;
        this.title = title;
        this.edition = edition;
        this.tracks = tracks;
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public List<Tracks> getTracks() {
        return tracks;
    }

    public void setTracks(List<Tracks> tracks) {
        this.tracks = tracks;
    }
}

