package ch.abbts.nds.swe.swdt.starter;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Rest_Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}