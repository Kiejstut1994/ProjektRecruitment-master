package pl.academy.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.academy.Entity.Test;

@RestController
@RequestMapping("/dupa")
public class TestCOntroller {

    @GetMapping()
    public Test showTest() {
        Test test = new Test();
        test.setTestId(1L);
        test.setTestText("DUPA");
        return test;
    }
}