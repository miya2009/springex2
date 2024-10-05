package com.pgm.springex2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public void hello(){
        log.info("hello");
    }
    @GetMapping("/ex1")
    public void ex1(String name, int age, String gender){
        log.info("ex1....");
        log.info("name:"+name);
        log.info("age:"+age);
        log.info("gender:"+gender);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam(name="name",defaultValue = "AAA", required = true) String name,
                    @RequestParam(name="age", required = false) int age,
                    @RequestParam String gender){
        log.info("ex2....");
        log.info("name:"+name);
        log.info("age:"+age);
        log.info("gender:"+gender);
    }
    @GetMapping("/ex3")
    public void ex3(@RequestParam("dueDate")LocalDate dueDate){
        log.info("ex3.....");
        log.info("dueDate:"+dueDate);
    }

    @GetMapping("/ex4")
    public void ex4(Model model){
        log.info("ex4.......................");
        model.addAttribute("message","Hello World");
    }
    @GetMapping("/ex5/{no}")
    public String ex5(@PathVariable("no") int no, Model model){
        log.info("ex5");
        log.info("no:"+no);
        model.addAttribute("no", no);
        return "ex5";
    }

    @GetMapping("/ex6")
    public String ex6(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("name", "ABC");
        redirectAttributes.addFlashAttribute("result","success");
        return "redirect:/ex7";
    }
    @GetMapping("ex7")
    public void ex7(String name, Model model){
        log.info("ex7");
        model.addAttribute("name", name);
    }
    @GetMapping("/ex8")
    public void ex8(String p1, int p2){
        log.info("p1.........."+p1);
        log.info("p2.........."+p2);
    }


}
