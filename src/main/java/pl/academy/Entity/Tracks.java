package pl.academy.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tracks")
public class Tracks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "tracktitle")
    private String tracktitle;
    @Column(name = "releseDate")
    private LocalDate releseDate;
    @ManyToOne
    private Album album;
    @OneToOne
    private TrackNumberAndLength trackNumberAndLength;

    public Tracks(Long id, String tracktitle, LocalDate releseDate, Album album, TrackNumberAndLength trackNumberAndLength) {
        this.id = id;
        this.tracktitle = tracktitle;
        this.releseDate = releseDate;
        this.album = album;
        this.trackNumberAndLength = trackNumberAndLength;
    }

    public Tracks() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTracktitle() {
        return tracktitle;
    }

    public void setTracktitle(String tracktitle) {
        this.tracktitle = tracktitle;
    }

    public LocalDate getReleseDate() {
        return releseDate;
    }

    public void setReleseDate(LocalDate releseDate) {
        this.releseDate = releseDate;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public TrackNumberAndLength getTrackNumberAndLength() {
        return trackNumberAndLength;
    }

    public void setTrackNumberAndLength(TrackNumberAndLength trackNumberAndLength) {
        this.trackNumberAndLength = trackNumberAndLength;
    }
}

