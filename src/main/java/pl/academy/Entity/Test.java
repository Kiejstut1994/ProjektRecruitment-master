package pl.academy.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEST_ID")
    private Long testId;

    @Column(name="TEST_TEXT")
    private String testText;

    public Test(Long testId, String testText) {
        this.testId = testId;
        this.testText = testText;
    }

    public Test() {
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestText() {
        return testText;
    }

    public void setTestText(String testText) {
        this.testText = testText;
    }
}