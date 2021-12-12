package docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerComposeServerApplication {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<String> callServer() {
        return new ResponseEntity<>("Server: Hello from server", HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/callServer")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Server: Hello, I heard your call", HttpStatus.OK);
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerComposeServerApplication.class, args);
    }

}
