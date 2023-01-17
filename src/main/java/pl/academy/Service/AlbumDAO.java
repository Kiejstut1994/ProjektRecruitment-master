package pl.academy.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.academy.Entity.Album;
import pl.academy.Entity.Tracks;
import pl.academy.Repository.AlbumRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
@Primary
public class AlbumDAO implements AlbumDAOInterface {
    private final AlbumRepository albumRepository;
    private final TrackDAO trackDAO;

    public AlbumDAO(AlbumRepository albumRepository, TrackDAO trackDAO) {
        this.albumRepository = albumRepository;
        this.trackDAO = trackDAO;
    }


    @Override
    public Album findById(Long id) {
        return albumRepository.findById(id).get();
    }

    @Override
    public List<Album> allAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public void saveAlbum(Album album) {
        albumRepository.save(album);
    }


    @Override
    public void addTrackToAlbum(Long albumId, Long trackId) {
        boolean notalreadyhave = true;
        Album album = findById(albumId);
        List<Tracks> tracks = album.getTracks();
        Iterator<Tracks> iterator = tracks.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == trackId) {
                notalreadyhave = false;
            }
        }
        if (notalreadyhave) {
            tracks.add(trackDAO.findTrackById(trackId));
            album.setTracks(tracks);
            albumRepository.save(album);
        }
    }
}

