package pl.academy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.academy.Entity.Tracks;

import java.util.List;

@Repository
public interface TracksRepository extends JpaRepository<Tracks,Long> {
    @Query("SELECT t from Tracks t where t.numberinamericanCD>0 order by t.numberinamericanCD asc")
    List<Tracks> americanCdTracks();
    @Query("SELECT t from Tracks t where t.numberinorginalCD>0 order by t.numberinorginalCD asc ")
    List<Tracks> orginalCdTracks();
    @Query("select sum(t.americanCDlength) from Tracks t where t.numberinamericanCD>0")
    Long americanCdLength();
    @Query("SELECT sum(t.orginalCDlength) from Tracks t where t.numberinorginalCD>0 ")
    Long orginalCdLength();
}

