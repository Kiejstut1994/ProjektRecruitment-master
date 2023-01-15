package pl.academy.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.academy.Entity.Tracks;
import pl.academy.Repository.TracksRepository;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class TrackDAO implements TrackDAOInterface{
    private  final TracksRepository tracksRepository;


    public TrackDAO(TracksRepository tracksRepository) {
        this.tracksRepository = tracksRepository;


    }

    @Override
    public Optional<Tracks> findTrackById(Long id) {
        return tracksRepository.findById(id);
    }

    @Override
    public void saveTrack(Tracks tracks) {
        tracksRepository.save(tracks);

    }

    @Override
    public void deleteTrack(Long id) {
        tracksRepository.deleteById(id);
    }

    @Override
    public String timeAmerican() {
        return changeTimeofSecondToString(tracksRepository.americanCdLength());
    }

    @Override
    public String timeOrginal() {
        return changeTimeofSecondToString(tracksRepository.orginalCdLength());
    }

    @Override
    public List<Tracks> americanCdTraccks() {
        return tracksRepository.americanCdTracks();
    }

    @Override
    public List<Tracks> orginalCdTraccks() {
        return tracksRepository.orginalCdTracks();
    }

    public String  changeTimeofSecondToString(Long time){
        Long min=time/60;
        Long secondsrest=time%60;
        String score=String.valueOf(min)+" "+String.valueOf(secondsrest);
        return score;
    }

}
