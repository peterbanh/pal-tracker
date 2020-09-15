package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    public EnvController() {
        //
    }

    @GetMapping("/env")
    public String getEnv() {
        return null;
    }
}
