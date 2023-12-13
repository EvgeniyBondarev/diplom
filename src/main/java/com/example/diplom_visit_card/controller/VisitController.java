package com.example.diplom_visit_card.controller;

import com.example.diplom_visit_card.model.Person;
import com.example.diplom_visit_card.service.LoggedPersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VisitController {
    LoggedPersonService loggedPersonService;
    Person person;

    public VisitController(LoggedPersonService loggedPersonService, Person person) {
        this.loggedPersonService = loggedPersonService;
        this.person = person;
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("person", person);
        return "main";
    }
    @GetMapping("/main")
    public String main(@RequestParam(required = false) String logout, Model model){//(required = false)
        if(logout != null)
            loggedPersonService.setName(null);
        return "redirect:/";
    }
    @GetMapping("/edit")//?logged
    public String edit(Model model){
        //System.out.println( "edit " + logged);

        if(loggedPersonService.logged()) {
            model.addAttribute("person", person);
            return "edit";
        }
        //model.addAttribute("logged", logged);
        return "login";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Person person, Model model){
        //System.out.println( "edit " + logged);
        if(loggedPersonService.logged()) {
            this.person = person;
            person.personToFile();
            model.addAttribute("person", person);
            return "main";
        }
        //model.addAttribute("logged", logged);
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping ("/login")
    public String login (@RequestParam String name, @RequestParam String password, Model model){
        loggedPersonService.setName(name);
        loggedPersonService.setPassword(password);
        if (loggedPersonService.logged()){
            //model.addAttribute("logged", name);
            model.addAttribute("person", person);
            return "edit";
        }
        return "redirect:/";

    }
}
