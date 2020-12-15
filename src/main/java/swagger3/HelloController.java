package swagger3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/")
    public String index() {
        log.info("getGreeting message {} ",  "hi");
        return "Greetings from Spring Boot!";
    }

}
