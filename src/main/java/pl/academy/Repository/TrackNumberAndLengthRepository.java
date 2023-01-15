package pl.academy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.academy.Entity.TrackNumberAndLength;

@Repository
public interface TrackNumberAndLengthRepository extends JpaRepository<TrackNumberAndLength,Long> {

}
