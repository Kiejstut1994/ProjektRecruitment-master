package pl.academy.Controllers;

import org.springframework.web.bind.annotation.*;
import pl.academy.Entity.TrackNumberAndLength;
import pl.academy.Service.TrackNumberAndLengthDAO;

@RestController
@RequestMapping("/tracknumberandlenth")
public class TrackNumberAndLenthController {
    private final TrackNumberAndLengthDAO trackNumberAndLengthDAO;

    public TrackNumberAndLenthController(TrackNumberAndLengthDAO trackNumberAndLengthDAO) {
        this.trackNumberAndLengthDAO = trackNumberAndLengthDAO;
    }
    @PostMapping("/savetrnumlen")
    public void saveTrackNumberAndLength(@RequestBody TrackNumberAndLength trackNumberAndLength){
        trackNumberAndLengthDAO.saveTrackNumberandLength(trackNumberAndLength);
    }
    @DeleteMapping("/deletetrnumlen/{id}")
    public void deleteTrackNumberAndLength(@PathVariable("id") Long id) {
        trackNumberAndLengthDAO.deleteTrackNumberandLength(id);
    }

}

