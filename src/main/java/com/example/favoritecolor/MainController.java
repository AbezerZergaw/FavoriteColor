package com.example.favoritecolor;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String  loadQuestionPage(Model model){
     model.addAttribute("color", new Color());
     return "colorform";
    }

    @PostMapping("/colorform")
    public String loadQuestionPage(@ModelAttribute Color color, Model model){


        model.addAttribute("color", color);
        return "confirmcolor";
    }




}
