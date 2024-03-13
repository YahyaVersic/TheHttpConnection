package server.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


// Rest Controller aka @ResponseBody at every method
@RestController
public class JsonController {

    public JsonController() {

    }


    @GetMapping("/ping")
    public String ping() {
        // Static html
        return "pong";
    }

    @GetMapping("/json")
    public ResponseEntity<List<String>> getJson() {
        var a = new ArrayList<String>(List.of("Hola", "Dos", "Tres", ":)"));
        return new ResponseEntity<>(a, HttpStatus.valueOf(200));
    }

    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] getImage() throws IOException {
        InputStream in = getClass().getResourceAsStream("/images/img.png");
        return in.readAllBytes();
    }

    @GetMapping(value = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public @ResponseBody byte[] getPdf() throws IOException {
        InputStream in = getClass().getResourceAsStream("/pdfs/Basic_pancakes_recipe_rosiesworld.pdf");
        return in.readAllBytes();
    }


}
