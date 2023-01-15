package pl.academy.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tracks")
public class Tracks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "tracktitle")
    private String tracktitle;
    @Column(name = "releseDate")
    private LocalDate releseDate;
    @Column(name = "numberinamericanCD")
    private Long numberinamericanCD;
    @Column(name = "americanCDlength")
    private Long americanCDlength;
    @Column(name = "numberinorginalCD")
    private Long numberinorginalCD;
    @Column(name = "orginalCDlength")
    private Long orginalCDlength;


    public Tracks() {
    }

    public Tracks(Long id, String tracktitle, LocalDate releseDate, Long numberinamericanCD, Long americanCDlength, Long numberinorginalCD, Long orginalCDlength) {
        this.id = id;
        this.tracktitle = tracktitle;
        this.releseDate = releseDate;
        this.numberinamericanCD = numberinamericanCD;
        this.americanCDlength = americanCDlength;
        this.numberinorginalCD = numberinorginalCD;
        this.orginalCDlength = orginalCDlength;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTracktitle() {
        return tracktitle;
    }

    public void setTracktitle(String tracktitle) {
        this.tracktitle = tracktitle;
    }

    public LocalDate getReleseDate() {
        return releseDate;
    }

    public void setReleseDate(LocalDate releseDate) {
        this.releseDate = releseDate;
    }

    public Long getNumberinamericanCD() {
        return numberinamericanCD;
    }

    public void setNumberinamericanCD(Long numberinamericanCD) {
        this.numberinamericanCD = numberinamericanCD;
    }

    public Long getAmericanCDlength() {
        return americanCDlength;
    }

    public void setAmericanCDlength(Long americanCDlength) {
        this.americanCDlength = americanCDlength;
    }

    public Long getNumberinorginalCD() {
        return numberinorginalCD;
    }

    public void setNumberinorginalCD(Long numberinorginalCD) {
        this.numberinorginalCD = numberinorginalCD;
    }

    public Long getOrginalCDlength() {
        return orginalCDlength;
    }

    public void setOrginalCDlength(Long orginalCDlength) {
        this.orginalCDlength = orginalCDlength;
    }

    @Override
    public String toString() {
        return this.tracktitle+" "+this.releseDate;
    }
}

