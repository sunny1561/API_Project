package com.example.testing;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alien")
public class AlienController {
    
    private final AlienRepository alienRepository;
    public AlienController(AlienRepository alienRepository) {
        this.alienRepository = alienRepository;
    }

    @PostMapping("/list")
    public  List<alien> saveAlien(@RequestBody List<alien> aliens) {
        return alienRepository.saveAll(aliens);
    }
}
