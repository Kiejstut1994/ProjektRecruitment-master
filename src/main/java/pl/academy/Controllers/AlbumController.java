package pl.academy.Controllers;


import org.springframework.web.bind.annotation.*;
import pl.academy.Entity.Album;
import pl.academy.Entity.Tracks;
import pl.academy.Service.AlbumDAO;
import pl.academy.Service.TrackDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
    private final AlbumDAO albumDAO;
    private final TrackDAO trackDAO;
    public AlbumController(AlbumDAO albumDAO, TrackDAO trackDAO) {
        this.albumDAO = albumDAO;
        this.trackDAO = trackDAO;
    }
    @GetMapping("/createAll")
    public void createAll() {
        Tracks tracks1=new Tracks(1L,"Settle Down", LocalDate.of(2008,1,1),1L,242L,1L,257L);
        Tracks tracks2=new Tracks(2L,"Something in the Way You are", LocalDate.of(2008,1,1),2L,263L,0L,0L);
        Tracks tracks3=new Tracks(3L,"Cameo Lover", LocalDate.of(2008,1,1),3L,243L,2L,242L);
        Tracks tracks4=new Tracks(4L,"Two way Street", LocalDate.of(2008,1,1),4L,260L,3L,268L);
        Tracks tracks5=new Tracks(5L,"Old Flame", LocalDate.of(2008,1,1),5L,270L,4L,267L);
        Tracks tracks6=new Tracks(6L,"Good intent", LocalDate.of(2008,1,1),6L,212L,5L,212L);
        Tracks tracks7=new Tracks(7L,"Plain Good Ring", LocalDate.of(2008,1,1),7L,272L,6L,242L);
        Tracks tracks8=new Tracks(8L,"Come into my head", LocalDate.of(2008,1,1),8L,279L,0L,0L);
        Tracks tracks9=new Tracks(9L,"Sally I can see you", LocalDate.of(2008,1,1),9L,238L,0L,0L);
        Tracks tracks10=new Tracks(10L,"Posse", LocalDate.of(2008,1,1),10L,307L,0L,0L);
        Tracks tracks11=new Tracks(11L,"Home", LocalDate.of(2008,1,1),11L,184L,0L,0L);
        Tracks tracks12=new Tracks(12L,"The build up", LocalDate.of(2008,1,1),12L,306L,11L,302L);
        Tracks tracks13=new Tracks(13L,"Warrior", LocalDate.of(2008,1,1),13L,256L,0L,0L);
        Tracks tracks14=new Tracks(14L,"Call me", LocalDate.of(2008,1,1),0L,0L,7L,272L);
        Tracks tracks15=new Tracks(15L,"Limbo", LocalDate.of(2008,1,1),0L,0L,8L,231L);
        Tracks tracks16=new Tracks(16L,"Wandering limbs", LocalDate.of(2008,1,1),0L,0L,9L,326L);
        Tracks tracks17=new Tracks(17L,"Withdraw", LocalDate.of(2008,1,1),0L,0L,10L,246L);
        trackDAO.saveTrack(tracks1);
        trackDAO.saveTrack(tracks2);
        trackDAO.saveTrack(tracks3);
        trackDAO.saveTrack(tracks4);
        trackDAO.saveTrack(tracks5);
        trackDAO.saveTrack(tracks6);
        trackDAO.saveTrack(tracks7);
        trackDAO.saveTrack(tracks8);
        trackDAO.saveTrack(tracks9);
        trackDAO.saveTrack(tracks10);
        trackDAO.saveTrack(tracks11);
        trackDAO.saveTrack(tracks12);
        trackDAO.saveTrack(tracks13);
        trackDAO.saveTrack(tracks14);
        trackDAO.saveTrack(tracks15);
        trackDAO.saveTrack(tracks16);
        trackDAO.saveTrack(tracks17);
        List<Tracks> tracksList1=new ArrayList<>();
        List<Tracks> tracksList2=new ArrayList<>();
        //album1
        tracksList1.add(tracks1);
        tracksList1.add(tracks2);
        tracksList1.add(tracks3);
        tracksList1.add(tracks4);
        tracksList1.add(tracks5);
        tracksList1.add(tracks6);
        tracksList1.add(tracks7);
        tracksList1.add(tracks8);
        tracksList1.add(tracks9);
        tracksList1.add(tracks10);
        tracksList1.add(tracks11);
        tracksList1.add(tracks12);
        tracksList1.add(tracks13);
       //album2
        tracksList2.add(tracks1);
        tracksList2.add(tracks3);
        tracksList2.add(tracks4);
        tracksList2.add(tracks5);
        tracksList2.add(tracks6);
        tracksList2.add(tracks7);
        tracksList2.add(tracks14);
        tracksList2.add(tracks15);
        tracksList2.add(tracks16);
        tracksList2.add(tracks17);
        tracksList2.add(tracks12);

        Album album1=new Album(1L,"Orginal","Kimbra","Vows",tracksList1);
        Album album2=new Album(2L,"North America","Kimbra","Vows",tracksList2);

        albumDAO.saveAlbum(album1);
        albumDAO.saveAlbum(album2);
    }
    @GetMapping("/all")
    public List<Album> allListAlbums() {
        return albumDAO.allAlbums();
    }
    @GetMapping("/show/{id}")
    public Album oneAlbumById(@PathVariable("id") Long id) {
        return albumDAO.findById(id);
    }
    @GetMapping("/addtrack/{albumid}/{trackid}")
    public void addTrackToAlbum(@PathVariable("albumid") Long albumid, @PathVariable("trackid") Long trackid) {
        albumDAO.addTrackToAlbum(albumid, trackid);
    }
}

