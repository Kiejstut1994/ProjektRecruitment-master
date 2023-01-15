package pl.academy.Controllers;

import org.springframework.web.bind.annotation.*;
import pl.academy.Entity.Tracks;
import pl.academy.Service.TrackDAO;
import pl.academy.Service.TrackNumberAndLengthDAO;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/track")
public class TrackController {

    private TrackDAO trackDAO;
    private TrackNumberAndLengthDAO trackNumberAndLengthDAO;

    public TrackController(TrackDAO trackDAO, TrackNumberAndLengthDAO trackNumberAndLengthDAO) {
        this.trackDAO = trackDAO;
        this.trackNumberAndLengthDAO = trackNumberAndLengthDAO;
    }
    @GetMapping("/showtrack/{id}")
    public Optional<Tracks> onetrackbyid(@PathVariable("id") Long id) {
        return trackDAO.findTrackById(id);
    }
    @PostMapping("/addtrack")
    public void addtrack(@RequestBody Tracks tracks) {
        trackDAO.saveTrack(tracks);
    }
    @DeleteMapping("/deletetrack/{id}")
    public void deletetrack(@PathVariable("id") Long id) {
        trackDAO.deleteTrack(id);
    }

    @GetMapping("/showamericantrack")
    public List<Tracks> americanCdTracks() {
        return trackDAO.americanCdTraccks();
    }

    @GetMapping("/showorginaltracks")
    public List<Tracks> orginalCdTracks() {
        List<Tracks> tracks=trackDAO.orginalCdTraccks();
        return trackDAO.orginalCdTraccks();
    }

}

