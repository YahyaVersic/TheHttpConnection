package server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;


@Controller
public class SimpleController {

    public SimpleController() {
    }

    @GetMapping("/hello")
    public String sayHello(Model m) {
        // Static html
        return "index";
    }


    @GetMapping("/time")
    public String tellTime(Model m) {
        // Thymleaf html
        var x = LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).localizedBy(Locale.GERMAN));

        m.addAttribute("time", x);
        return "time";
    }


}

