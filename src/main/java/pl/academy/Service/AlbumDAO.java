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
    public Optional<Album> findById(Long id) {
        return albumRepository.findById(id);
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
    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }

    @Override
    public void addTrackToAlbum(Long AlbumId, Long TrackId) {
        boolean notalreadyhave = true;
        Optional<Album> album = findById(AlbumId);
        List<Tracks> tracks= album.get().getTracks();
        Iterator<Tracks> iterator= tracks.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId()==TrackId){
                notalreadyhave=false;
            }
        }
        if (notalreadyhave){
            tracks.add(trackDAO.findTrackById(TrackId).get());
            album.get().setTracks(tracks);
            albumRepository.save(album.get());
        }
    }
}

