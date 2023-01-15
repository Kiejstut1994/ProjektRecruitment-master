package pl.academy.Controllers;


import org.springframework.web.bind.annotation.*;
import pl.academy.Entity.Album;
import pl.academy.Service.AlbumDAO;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/album")
public class AlbumController {
    private  AlbumDAO albumDAO;
    public AlbumController(AlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }
    @GetMapping("/all")
    public List<Album> allListAlbums() {
        return albumDAO.allAlbums();
    }
    @GetMapping("/show/{id}")
    public Album oneAlbumById(@PathVariable("id") Long id) {
        return albumDAO.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAlbum(@PathVariable("id") Long id) {
        albumDAO.deleteAlbum(id);
    }
    @PostMapping("/add")
    public void addAlbum(@RequestBody Album album) {
        albumDAO.saveAlbum(album);
    }
    @GetMapping("/addtrack/{albumid}/{trackid}")
    public void addTrackToAlbum(@PathVariable("albumid") Long albumid, @PathVariable("trackid") Long trackid) {
        albumDAO.addTrackToAlbum(albumid, trackid);
    }
}

