package co.thirtyroses.ai.lucien;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @GetMapping("/hello")
    HelloResponse hello() {
        return new HelloResponse("world");
    }

}

record HelloResponse(String message) {}
