package com.example.test.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class Cntr {

    @GetMapping("/")
    public String greeting( Model model) {
        Integer i = 0;
        i = 1;
        model.addAttribute("home", "Dungeon master");
        return "test";
    }

    @GetMapping("/calc")
    public String calc(Model model)
    {
        model.addAttribute("home", 38);
        return "test";
    }

    @GetMapping("/result")
    public String res(@RequestParam(value = "varaibel", required = false, defaultValue = "20")
                          int a,
                      @RequestParam(value = "varaibel1", required = false, defaultValue = "20")
                              int b,
                      Model model)
    {
        int c = a + b;
        model.addAttribute("home", c);
        return "result";
    }

    @GetMapping("/start")
    public String start (Model model, @RequestParam(value = "fistValues", required = false, defaultValue = "0") double a,
                                      @RequestParam(value = "secondValues", required = false, defaultValue = "0") double b,
                                      @RequestParam(value = "select", required = false, defaultValue = "+") String s)
    {
        double c = 0;

        switch (s)
        {
            case "+": c= a+b; break;
            case "-": c= a-b; break;
            case "*": c= a*b; break;
            case "/": c= a/b; break;
        }
        model.addAttribute("answer", c);

        return "result";
    }

    @PostMapping("/start")
    public String end (Model model, @RequestParam(value = "fistValues1", required = false, defaultValue = "0") double a,
                         @RequestParam(value = "secondValues1", required = false, defaultValue = "0") double b,
                         @RequestParam(value = "select1", required = false, defaultValue = "+") String s)
    {
        double c = 0;

        switch (s)
        {
            case "+": c= a+b; break;
            case "-": c= a-b; break;
            case "*": c= a*b; break;
            case "/": c= a/b; break;
        }
        model.addAttribute("answer", c);

        return "result";
    }

}