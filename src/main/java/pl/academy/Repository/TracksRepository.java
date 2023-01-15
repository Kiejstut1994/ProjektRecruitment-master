package pl.academy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.academy.Entity.Tracks;

import java.util.List;

@Repository
public interface TracksRepository extends JpaRepository<Tracks,Long> {
    @Query("SELECT t from Tracks t join TrackNumberAndLength tr on t.trackNumberAndLength=tr where tr.numberinamericanCD>0 order by tr.numberinamericanCD desc ")
    List<Tracks> americanCdTracks();
    @Query("SELECT t from Tracks t join TrackNumberAndLength tr on t.trackNumberAndLength=tr where tr.numberinorginalCD>0 order by tr.numberinorginalCD desc ")
    List<Tracks> orginalCdTracks();
    @Query("SELECT sum(tr.americanCDlength) from TrackNumberAndLength tr where tr.numberinamericanCD>0 ")
    Long americanCdLength();
    @Query("SELECT sum(tr.orginalCDlength) from TrackNumberAndLength tr where tr.numberinorginalCD>0 ")
    Long orginalCdLength();
}

