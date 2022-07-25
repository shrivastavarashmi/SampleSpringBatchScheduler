package org.example.functions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchController {

    @GetMapping(value = "/")
    public String getBatchHealth(){
        return "Batch Service is UP!";
    }
}
