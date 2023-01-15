package pl.academy.Service;

import pl.academy.Entity.TrackNumberAndLength;

import java.util.Optional;

public interface TrackNumberAndLengthDAOInterface {
    Optional<TrackNumberAndLength> findById(Long id);
    void saveTrackNumberandLength(TrackNumberAndLength trackNumberAndLength);
    void deleteTrackNumberandLength(Long id);
}

