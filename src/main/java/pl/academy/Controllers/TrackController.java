package pl.academy.Controllers;

import org.springframework.web.bind.annotation.*;
import pl.academy.Entity.Tracks;
import pl.academy.Service.TrackDAO;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/track")
public class TrackController {

    private final TrackDAO trackDAO;

    public TrackController(TrackDAO trackDAO) {
        this.trackDAO = trackDAO;
    }

    @GetMapping("/showtrack/{id}")
    public Tracks oneTrackById(@PathVariable("id") Long id) {
        return trackDAO.findTrackById(id);
    }


    @GetMapping("/showamericantrack")
    public List<Tracks> americanCdTracks() {
        return trackDAO.americanCdTraccks();
    }

    @GetMapping("/showorginaltracks")
    public List<Tracks> orginalCdTracks() {
        return trackDAO.orginalCdTraccks();
    }

    @GetMapping("/timeorginaltracks")
    public String timeOrginalCdTracks() {
        return trackDAO.timeOrginal();
    }

    @GetMapping("/timeamericantracks")
    public String timeAmericanCdTracks() {
        return trackDAO.timeAmerican();
    }

}

