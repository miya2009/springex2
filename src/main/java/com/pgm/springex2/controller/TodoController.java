package com.pgm.springex2.controller;

import com.pgm.springex2.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {
    //@RequestMapping(value = "list", method = RequestMethod.GET)
    @GetMapping("/list")
    public void list(){
        log.info("todo list....");
    }
    //@RequestMapping(value = "register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet(){
        log.info("todo register....");
    }
    //@RequestMapping(value = "register", method = RequestMethod.POST)
    @PostMapping("/register")
    public String registerPost(@ModelAttribute TodoDTO todoDTO){
        log.info("todo post register...");
        log.info(todoDTO);
        return "redirect:/todo/list";
    }
}
