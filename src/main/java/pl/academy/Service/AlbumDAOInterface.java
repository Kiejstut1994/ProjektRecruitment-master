package pl.academy.Service;

import pl.academy.Entity.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumDAOInterface {
    Album findById(Long id);

    List<Album> allAlbums();

    void saveAlbum(Album album);

    void addTrackToAlbum(Long AlbumId, Long TrackId);

}

