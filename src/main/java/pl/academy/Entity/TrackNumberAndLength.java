package pl.academy.Entity;

import javax.persistence.*;

@Entity
@Table(name = "trackNumberAndLength")
public class TrackNumberAndLength {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "numberinamericanCD")
    private Long numberinamericanCD;
    @Column(name = "americanCDlength")
    private Long americanCDlength;
    @Column(name = "numberinorginalCD")
    private Long numberinorginalCD;
    @Column(name = "orginalCDlength")
    private Long orginalCDlength;

    public TrackNumberAndLength(Long id, Long numberinamericanCD, Long americanCDlength, Long numberinorginalCD, Long orginalCDlength) {
        this.id = id;
        this.numberinamericanCD = numberinamericanCD;
        this.americanCDlength = americanCDlength;
        this.numberinorginalCD = numberinorginalCD;
        this.orginalCDlength = orginalCDlength;
    }

    public TrackNumberAndLength() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
