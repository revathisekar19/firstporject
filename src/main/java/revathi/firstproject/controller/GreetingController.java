package revathi.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting/")
public class GreetingController {

    @GetMapping("/hello/{name}")
    public String insert(@PathVariable("name") String name) {
        return "Hello" + name;
    }

    @GetMapping("/hi/{name}")
    //Comment added
    public String insert2(@PathVariable("name") String name) {
        return "Hi " + name;
    }

    @GetMapping("/Hey/{name}")
    public String insert3(@PathVariable("name") String name) {
        return "Hey " + name;
    }

}
