package pl.academy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.academy.Entity.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {
}

