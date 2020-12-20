package br.com.levez.statistics;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @GetMapping
    public ResponseEntity<String> teste(){
        return new ResponseEntity<>(
                "Teste ok", HttpStatus.OK);
    }
}
