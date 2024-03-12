package server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class JsonController {

    public JsonController() {

    }

    @GetMapping("/json")
    public ResponseEntity<List<String>> getJson() {
        var a = new ArrayList<String>(List.of("Hola", "Dos", "Tres", ":)"));
        return new ResponseEntity<>(a, HttpStatus.valueOf(200));
    }


}
