package pl.academy.Service;

import pl.academy.Entity.Tracks;

import java.util.List;
import java.util.Optional;

public interface TrackDAOInterface {
    Tracks findTrackById(Long id);
    void saveTrack(Tracks tracks);
    void deleteTrack(Long id);
    String timeAmerican();
    String timeOrginal();
    List<Tracks> americanCdTraccks();
    List<Tracks> orginalCdTraccks();
}
