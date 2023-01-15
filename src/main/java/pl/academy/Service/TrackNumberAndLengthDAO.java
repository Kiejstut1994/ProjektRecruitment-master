package pl.academy.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.academy.Entity.TrackNumberAndLength;
import pl.academy.Repository.TrackNumberAndLengthRepository;

import java.util.Optional;

@Service
@Primary
public class TrackNumberAndLengthDAO implements TrackNumberAndLengthDAOInterface{
    private final TrackNumberAndLengthRepository trackNumberAndLengthRepository;

    public TrackNumberAndLengthDAO(TrackNumberAndLengthRepository trackNumberAndLengthRepository) {
        this.trackNumberAndLengthRepository = trackNumberAndLengthRepository;
    }

    @Override
    public Optional<TrackNumberAndLength> findById(Long id) {
        return trackNumberAndLengthRepository.findById(id);
    }

    @Override
    public void saveTrackNumberandLength(TrackNumberAndLength trackNumberAndLength) {
        trackNumberAndLengthRepository.save(trackNumberAndLength);
    }

    @Override
    public void deleteTrackNumberandLength(Long id) {
        trackNumberAndLengthRepository.deleteById(id);
    }
}
