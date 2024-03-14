package server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;


@Controller
public class SimpleController {

    @GetMapping("/hello")
    public String sayHello() {
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

